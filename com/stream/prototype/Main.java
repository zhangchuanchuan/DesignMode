public class Main{
  public static void main(String[] args){
    //减少类的依赖，实现复用
    Prototype p = new ConcretePrototype();
    Prototype cp = p.createClone();
    
  }
}
