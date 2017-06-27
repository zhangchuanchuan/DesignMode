public class Main {
  public static void main(String[] args) {
    Display d1 = new StringDisplay("Hello, World");
    Display d2 = new SideBorder(b1, '#');
    Display d3 = new FullBorder(b2);
    b1.show();
    b2.show();
    b3.show();
  }
}
