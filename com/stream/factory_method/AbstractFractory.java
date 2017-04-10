public abstract class AbstractFactory{
  public final create(){
    Product p = createProduct();
    return p;
  }

  public abstract Product createProduct();
}
