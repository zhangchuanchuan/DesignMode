public class AbstractFactoryImpl extends AbstractFactory{
  @override
  public Product createProduct(){
    return new ProductA();
  }
}
