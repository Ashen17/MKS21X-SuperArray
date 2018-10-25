public class Driver{
  public static void main(String[] args) {
    SuperArray a = new SuperArray();
    System.out.println("Expected: [] Actual:" + a);
    System.out.println("Expected: 0 Actual:" + a.size());
    for (int n = 0; n <8; n++){a.add("MoM");}
    System.out.println("Expected: [Mom, Mom, Mom, Mom, Mom, Mom, Mom, Mom, null, null] Actual:" + a.toStringDebug());
    a.clear();
    System.out.println("Expected: [] Actual:"+ a);
    System.out.println("Expected: true Actual:" + a.isEmpty());
    System.out.println("Expected: [Mom, Mom, Mom, Mom, Mom, Mom, Mom, Mom, null, null] Actual:"+a.toStringDebug());
    SuperArray b = new SuperArray();
    for (int n = 0; n < 15; n++){b.add("BOO");}
    System.out.println("Expected: [BOO, BOO, BOO, BOO, BOO, BOO, BOO, BOO, BOO, BOO, BOO, BOO, BOO, BOO, BOO, BOO, null, null, null, null, null, null] Actual:"+b.toStringDebug());
  }
}
