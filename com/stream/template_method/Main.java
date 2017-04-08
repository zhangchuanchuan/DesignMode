public class Main {
  //在父类中定义处理流程的框架，在子类中实现具体的处理
  public static void main(String[] args) {
    ConcreteClassA a = new ConcreteClassA();
    ConcreteClassB b = new ConcreteClassB();
    a.method();
    b.method();
  }
}
