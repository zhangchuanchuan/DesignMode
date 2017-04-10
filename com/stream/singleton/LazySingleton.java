public class LazySingleton {
  private static LazySingleton singleton;

  //私有坏构造
  private LazySingleton(){}

  public static LazySingleton getSingleton(){
    if (singleton == null) {
      synchronized (LazySingleton.class) {
        if (singleton == null) {
          singleton = new LazySingleton();
        }
      }
    }
    return singleton;
  }
}
