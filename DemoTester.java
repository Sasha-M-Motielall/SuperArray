public class DemoTester {
  public static void main(String[] args) {
    SuperArray words = new SuperArray();
    words.add("kani"); words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");
    System.out.println(words);
    Demo.removeDuplicates(words);
    System.out.println(words);
  }
}
