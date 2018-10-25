public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[10];
    size = 10;
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

}
