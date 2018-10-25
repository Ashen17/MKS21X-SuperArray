public class Driver{
  public static void main(String[] args) {
    SuperArray a = new SuperArray();
    System.out.println(a);
    System.out.println(a.size());
    a.clear();
    System.out.println(a);
    System.out.println(a.isEmpty());
    System.out.println(a.toStringDebug());
  }
}
