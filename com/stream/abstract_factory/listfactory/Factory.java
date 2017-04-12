public class Factory implements AbstractFactory {
  public Product createProduct() {
    return new ConcreteProductA();
  }

  public Product createProduct2() {
    return new ConcreteProductB();
  }

  public Product createProduct3() {
    return new ConcreteProductC();
  }
}
