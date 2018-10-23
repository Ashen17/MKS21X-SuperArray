public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[10];
    size = 10
  }

  public void clear(){
    size = 0
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
    if (index < 0 || index >= size()){return null;}
    return data[pos];
  }
  public void set(int pos, String new){
    if (index < 0 || index >= size()){
      System.out.println("IndexOutOfBounds");
      return null;
    }
    data[pos] = new;

  }
}
