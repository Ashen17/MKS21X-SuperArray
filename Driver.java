public class Driver{
  public static void main(String[] args) {
    System.out.println("Phase 1 Driver");
    SuperArray a = new SuperArray();
    System.out.println("Expected: [] Actual:" + a);
    System.out.println("Expected: 0 Actual:" + a.size());
    for (int n = 0; n <8; n++){a.add("MoM");}
    System.out.println("Expected: [MoM, MoM, MoM, MoM, MoM, MoM, MoM, MoM, null, null] Actual:" + a.toStringDebug());
    a.clear();
    System.out.println("Expected: [] Actual:"+ a);
    System.out.println("Expected: true Actual:" + a.isEmpty());
    System.out.println("Expected: [MoM, MoM, MoM, MoM, MoM, MoM, MoM, MoM, null, null] Actual:"+a.toStringDebug());

    System.out.println("Resize and add additional testing");
    SuperArray b = new SuperArray();
    for (int n = 0; n < 15; n++){b.add("BOO");}
    System.out.println("Expected: [BOO, BOO, BOO, BOO, BOO, BOO, BOO, BOO, BOO, BOO, BOO, BOO, BOO, BOO, BOO, BOO, null, null, null, null, null, null] Actual:"+b.toStringDebug());
    for (int n = 0; n <= 3; n++){
      System.out.println("Expected: 10/21/43/87  Actual:"+ SuperArray.getTrueSize(a));
      a.resize();
    }
  }
}
