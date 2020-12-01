public class SuperArrayTester {
  public static void main(String[] args) {

    SuperArray tester1 = new SuperArray();
    System.out.println(tester1.size());
    System.out.println(tester1.add("hi"));
    System.out.println(tester1.size());
    System.out.println(tester1.get(0));
    System.out.println(tester1.set(0, "hello"));
    System.out.println(tester1.get(0));
    tester1.add("hey");
    tester1.add("hiya");
    System.out.println(tester1.size());
    System.out.println(tester1.isEmpty());
    System.out.println(tester1.toString());
    System.out.println(tester1.contains("wassup"));
    System.out.println(tester1.remove(0));
    System.out.println(tester1.toString());
    System.out.println(tester1.indexOf("hiya"));

    SuperArray tester2 = new SuperArray(5);
    System.out.println(tester2.add("action"));
    System.out.println(tester2.isEmpty());
    tester2.add("adventure");
    tester2.add("thriller");
    tester2.add("horror");
    tester2.add("rom-com");
    System.out.println(tester2.toString());
    tester2.add(5, "drama");
    tester2.add(6, "sci-fi");
    tester2.add(7, "comedy");
    tester2.add(8, "animation");
    tester2.add(9, "mystery");
    System.out.println(tester2.toString());
    tester2.add(6, "musical");
    System.out.println(tester2.contains("drama"));
    System.out.println(tester2.contains("western"));
    System.out.println(tester2.remove(8));
    System.out.println(tester2.toString());
    System.out.println(tester2.indexOf("drama"));

    SuperArray tester3 = new SuperArray();
    tester3.add("dog");
    tester3.add("cat");
    tester3.add("bird");
    tester3.add("hamster");
    tester3.add("cat");
    tester3.add("monkey");
    tester3.add("frog");
    tester3.add("dog");
    System.out.println(tester3.toString());
    System.out.println(tester3.lastIndexOf("cat"));
    System.out.println(tester3.lastIndexOf("dog"));

    SuperArray tester4 = new SuperArray();
    tester3.add("dog");
    tester3.add("cat");
    tester3.add("bird");
    tester3.add("hamster");
    tester3.add("cat");
    tester3.add("monkey");
    tester3.add("frog");
    tester3.add("dog");
    System.out.println(tester3.equals(tester4));
    tester4.add("panda");
    System.out.println(tester3.equals(tester4));
  }
}
