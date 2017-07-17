public class Database {
  private Database() {}

  public static Properties getProperties(String name) {
    String filename = name + ".txt";
    Properties prop = new Properties();
    try {
      prop.load(new FileInputStream(filename));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
