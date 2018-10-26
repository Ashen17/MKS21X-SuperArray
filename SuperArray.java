public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[10];
    size = 0;
  }

  public SuperArray(String[] ary){
    data = ary;
    size = ary.length;
  }
  public SuperArray(SuperArray a){
    data = a.data;
    size = a.size;
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
    if (this.isEmpty()){return "[]";}
    String result = "[" + data[0];
    for (int p = 1; p < size ; p++){
      result += "," + " " + data[p];
    }
    return result + "]";
  }

  public String toStringDebug(){
    if (data.length == 0){return "[]";}
    String result = "[" + data[0];
    for (int p = 1; p < data.length; p++){
      result +=  "," + " " + data[p];
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
    for (int n = size - 1; n > -1; n--){
      if (data[n].equals(str)){return n;}
    }
    return -1;
  }

  public void add(int index, String str){
    if (index < 0 || index > size()){
      System.out.println("IndexOutOfBounds");
    }
    else {
      SuperArray copy = new SuperArray(this);
      if (copy.data.length == copy.size){copy.resize();}
      copy.data[index] = str;
      for (int n = index + 1; n < size + 1; n++){
        copy.data[n] = data[n-1];
      }
      data = copy.data;
      size++;
    }
  }

  public String remove(int index){
    if (index < 0 || index > size()){return null;}
    String old = data[index];
    for(int n = index; index < size - 1; n++){
      data[n] = data[n+1];
    }
    data[size - 1] = null;
    return old;
  }
    //Static methods for testing purposes
  public static int getTrueSize(SuperArray x){
      return x.data.length;
    }


}
