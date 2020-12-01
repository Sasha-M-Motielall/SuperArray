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

  private void resize() {
    String[] arr = new String[data.length*2 + 1];
    for (int i=0;i<data.length;i++) {
      arr[i] = data[i];
    }
    data = arr;
  }

  public boolean add(String element) {
    if (size == data.length) {
      resize();
    }
    data[size] = element;
    size++;
    return true;
  }
}
