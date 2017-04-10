public class HugrySingleton{
  private static HugrySingleton singleton = new HugrySingleton();
  private HugrySingleton(){}

  public static HugrySingleton(){
    return singleton;
  }
}
