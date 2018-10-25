public class Driver{
  public static void main(String[] args) {
    SuperArray a = new SuperArray();
    System.out.println(a);
    System.out.println(a.size());
    a.clear();
    System.out.println(a);
    System.out.println(a.isEmpty());
    System.out.println(a.toStringDebug());
    SuperArray b = new SuperArray();
    for (int n = 0; n < 15; n++){b.add("BOO");}
    System.out.println(b);
  }
}
