public class Client {
  public void methdo() {
    Flyweight fl = new Flyweight();
    Flyweight fw = FlyweightFactory.getFlyWeight("key");//第一次是new的
    fw = FlyweightFactory.getFlyWeight("key");//第二次用的就是缓存的

  }
}
