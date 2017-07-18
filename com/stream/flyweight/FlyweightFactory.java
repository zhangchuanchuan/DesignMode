public class FlyweightFactory {
  private HashMap pool = new HashMap();
  public Flyweight getFlyWeight(String key) {
    Flyweight fw = pool.get(key);
    if (fw == null) {
      fw = new Flyweight();
      pool.put(key, fw);
    }
    return fw;
  }

}
