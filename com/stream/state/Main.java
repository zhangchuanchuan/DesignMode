public class Main {
  public static void main(String[] args) {
    State a = new StateA();
    State b = new StateB();
    State choose = null;
    switch(STATE) {
      case A:
        choose = a;
        break;
      case B:
        choose = b;
        break;
    }
    if (choose != null) {
      choose.method1();
      choose.method2();
    }
  }
}
