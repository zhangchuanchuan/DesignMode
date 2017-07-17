public class Main {
  public static void main(String[] args) {
    ObserverImpl impl1 = new ObserverImpl();
    ObserverImpl impl2 = new ObserverImpl();
    Observerable ob = new Observerable();
    ob.addObserver(impl1);
    ob.addObserver(impl2);
  }
}
