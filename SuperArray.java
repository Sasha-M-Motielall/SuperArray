public class SuperArray{
  private String[] data;
  private int size;
  public SuperArray() {
    data = new String[10];
    size = 0;
  }

  public SuperArray(int startingCapacity) {
    if (startingCapacity< 0) {
      throw new IllegalArgumentException("Starting Capacity" + startingCapacity + "cannot be negative");
    }
    data = new String[startingCapacity];
    size = 0;
  }

  public int size() {
    return size;
  }
}
