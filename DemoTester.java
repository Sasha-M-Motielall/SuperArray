public class DemoTester {
  public static void main(String[] args) {
    SuperArray words = new SuperArray();
    words.add("kani"); words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");
    System.out.println(words);
    Demo.removeDuplicates(words);
    System.out.println(words);

    SuperArray overlaps = new SuperArray();
    overlaps.add("a");  overlaps.add("b");  overlaps.add("c");
    overlaps.add("d");  overlaps.add("e");  overlaps.add("f");
    SuperArray overlaps2 = new SuperArray();
    overlaps2.add("e"); overlaps2.add("f");  overlaps2.add("g");
    overlaps2.add("h"); overlaps2.add("i");  overlaps2.add("j");
    System.out.println(Demo.findOverLap(overlaps,overlaps2));
  }
}
