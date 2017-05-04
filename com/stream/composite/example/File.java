public class File extends Entry {
  private String name;
  private int size;
  public File(String name, int size) {
    this.name = name;
    this.size = size;
  }
  public String getNmae() {
    return name;
  }
  public int getSize() {
    return size;
  }
  protected void printList(String prefix) {
    System.out.println(prefix + "/" + this);
  }
}
