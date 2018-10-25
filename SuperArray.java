public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[10];
    size = 0;
  }

  public void clear(){
    size = 0;
  }

  public int size(){
    return size;
  }
  public boolean isEmpty(){
    return size == 0;
  }

  public String toString(){
    String result = "[";
    for (int p = 0; p < size; p++){
      result += data[p] + "," + " ";
    }
    return result + "]";
  }

  public String toStringDebug(){
    String result = "[";
    for (int p = 0; p < data.length; p++){
      result += data[p] + "," + " ";
    }
    return result + "]";
  }
  public String get(int pos){
    if (pos < 0 || pos >= size()){
      System.out.println("IndexOutOfBounds");
      return null;
    }
    return data[pos];
  }
  public String set(int pos, String str){
    if (pos < 0 || pos >= size()){
      System.out.println("IndexOutOfBounds");
      return null;
    }
    String old = data[pos];
    data[pos] = str;
    return old;
  }
  public void resize(){
    String[] result = new String[data.length * 2 + 1];
    for (int pos = 0; pos < data.length;pos++ ){
      result[pos] = data[pos];
    }
    data = result;
  }

  public boolean add(String str){
    if (data.length == size){resize();}
    data[size] = str;
    size += 1;
    return true;
  }

  public boolean contain(String str){
    for (int n = 0; n < size; n++){
      if (data[n].equals(str)){return true;}
    }
    return false;
  }

  public int indexOf(String str){
    for (int n = 0; n < size; n++){
      if (data[n].equals(str)){return n;}
    }
    return -1;
  }

  public int lastIndexOf(String str){
    for (int n = size; n > -1; n--){
      if (data[n].equals(str)){return n;}
    }
    return -1;
  }
    //Static methods for testing purposes
  public static int getTrueSize(SuperArray x){
      return x.data.length;
    }


}
