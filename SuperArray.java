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

  public String get (int index) {
    if (index<0||index>=size) {
      throw new IndexOutOfBoundsException("Index" + index + "cannot be out of range of the SuperArray");
    }
    return data[index];
  }

  public String set(int index, String element) {
    if (index<0||index>=size) {
      throw new IndexOutOfBoundsException("Index" + index + "cannot be out of range of the SuperArray");
    }
    String replaced = data[index];
    data[index] = element;
    return replaced;
  }

  public void clear() {
    data = new String[data.length];
    size = 0;
  }

  public boolean isEmpty() {
   return size == 0;
 }

 public String toString() {
  if (size == 0) {
    return "[]";
  }
  String newString = "[";
  for (int i=0;i<size-1;i++) {
    newString+=data[i] + ", ";
  }
  return newString + data[size-1] + "]";
}
}
