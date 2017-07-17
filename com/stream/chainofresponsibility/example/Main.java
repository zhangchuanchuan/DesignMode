public class Main {
  public static void main(String[] args) {
    Trouble trouble = new Trouble(1);
    Support a = new SupportA("a");
    Support b = new SupportB("b");
    Support c = new SupportC("c");
    Support d = new SupportD("d");
    a.setNext(b).setNext(c).setNext(d);
    a.support(trouble);
  }
}
