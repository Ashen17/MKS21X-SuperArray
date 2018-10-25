public class Driver{
  public static void main(String[] args) {
    System.out.println("Phase 1 and resize Driver");
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
    String[] d = new String[]{"hi", "bye", "greetings", "konichiwa", "hola", "nihao"};
    SuperArray c = new SuperArray(d);
    System.out.println("Expected: bye  Actual:" + c.get(1));
    System.out.println("Expected: IndexOutOfBounds Actual:" + c.get(7));
    System.out.println("Expected: IndexOutOfBounds Actual:" + c.get(-4));
    System.out.println("Expected: IndexOutOfBounds Actual:" + c.set(7, "hello"));
    System.out.println("Expected: IndexOutOfBounds Actual:" + c.set(-1, "hello"));
    System.out.println("Expected: hi Actual:" + c.get(0));
    System.out.println("Expected: {hi, bye, greetings, konichiwa, hola, nihao} Actual:" + c);
    c.set(0, "hello");
    System.out.println("Expected: hello Actual:" + c.get(0));
    System.out.println("Expected: {hello, bye, greetings, konichiwa, hola, nihao} Actual:" + c);
    }
  }
