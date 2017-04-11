public class Main{
  public static void main(String[] args){
    ConcreteBuilderA builderA = new ConcreteBuilderA();
    COncreteBuilderB builderB = new ConcreteBuilderB();
    Director a = new Director(builderA);
    Director b = new Director(builderB);
    a.consctract();
    b.consctract();
  }
}
