public class Main {
  public static void main(String[] args){
    Display d1 = new Dispaly(new StringDisplayImpl("Hello World"));
    Display d2 = new Display(new StringDisplayImpl("Hello Universe"));
    CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello Code"));
    d1.display();
    d2.display();
    d3.multiDisplay();
  }
}
