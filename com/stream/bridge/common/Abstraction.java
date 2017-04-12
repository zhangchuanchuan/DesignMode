public class Abstraction{
  private Implementor impl;
  public Abstraction(Implementor impl){
    this.impl = impl;
  }
  public void funtion1(){
    impl.method1();
  }
  public void funtion2(){
    impl.method2();
  }
  public void funtion3(){
    impl.method3();
  }
}
