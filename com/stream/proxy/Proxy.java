public class Proxy implements Subject {
  private Subject realSubject;

  public void request1() {
    //...
    realSubject.request1();
    //...
  }

  public void request2() {
    //...
    realSubject.request2();
    //...
  }

  public void request3() {
    //...
    realSubject.request3();
    //...
  }
}
