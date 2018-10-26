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
    String[] nothing = new String[]{};
    SuperArray empty = new SuperArray(nothing);
    System.out.println("Expected : [] Actual:" + empty);
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
    System.out.println("Expected: null Actual:" + c.get(7) + " IndexOutOfBounds will be printed above");
    System.out.println("Expected: null Actual:" + c.get(-4) + " IndexOutOfBounds will be printed above");
    System.out.println("Expected: null Actual:" + c.set(7, "hello") + " IndexOutOfBounds will be printed above");
    System.out.println("Expected: null Actual:" + c.set(-1, "hello") + " IndexOutOfBounds will be printed above");
    System.out.println("Expected: hi Actual:" + c.get(0));
    System.out.println("Expected: {hi, bye, greetings, konichiwa, hola, nihao} Actual:" + c);
    System.out.println("Expected: hi Actual:" + c.set(0, "hello"));
    System.out.println("Expected: hello Actual:" + c.get(0));
    System.out.println("Expected: [hello, bye, greetings, konichiwa, hola, nihao] Actual:" + c);
    System.out.println("Phase 3");
    String[] e = new String[]{"fire", "water", "electric", "normal", "grass", "earth"};
    SuperArray f = new SuperArray(e);
    System.out.println("Expected: [fire, water, electric, normal, grass, earth] Actual:" + f);
    System.out.println("Expected: [fire, water, electric, normal, grass, earth] Actual:" + f.toStringDebug());
    System.out.println("Expected: true  Actual:" + f.contains("normal"));
    System.out.println("Expected: false  Actual:" + f.contains("Normal"));
    System.out.println("Expected: false  Actual:" + f.contains("psychic"));
    System.out.println("Expected: true  Actual:" + f.contains("fire"));
    System.out.println("Expected: true  Actual:" + f.contains("earth"));
    System.out.println("Expected: 0  Actual:" + f.indexOf("fire"));
    System.out.println("Expected: 5  Actual:" + f.indexOf("earth"));
    System.out.println("Expected: -1  Actual:" + f.indexOf("psychic"));
    System.out.println("Expected: normal  Actual:" + f.set(3, "fire"));
    System.out.println("Expected: grass  Actual:" + f.set(4, "earth"));
    System.out.println("Expected: 0  Actual:" + f.indexOf("fire"));
    System.out.println("Expected: 3  Actual:" + f.lastIndexOf("fire"));
    System.out.println("Expected: 4  Actual:" + f.indexOf("earth"));
    System.out.println("Expected: 5  Actual:" + f.lastIndexOf("earth"));
    String[] h = new String[]{"hydrogen", "helium", "berylium", "boron", "carbon"};
    SuperArray g = new SuperArray(h);
    g.add(2, "lithium");
    System.out.println("Expected:[hydrogen, helium, lithium, berylium, boron, carbon] Actual: " + g);
    System.out.println("Expected: carbon Actual: " + g.remove(5));
    System.out.println("Expected:[hydrogen, helium, lithium, berylium, boron] Actual: " + g);
    System.out.println("Expected:[hydrogen, helium, lithium, berylium, boron, null, null, null, null, null, null] Actual: " + g.toStringDebug());
    System.out.println("Expected: true Actual: " + g.remove("hydrogen"));
    System.out.println("Expected:[helium, lithium, berylium, boron] Actual: " + g);
    System.out.println("Expected:[helium, lithium, berylium, boron, null, null, null, null, null, null, null] Actual: " + g.toStringDebug());

  }
}
