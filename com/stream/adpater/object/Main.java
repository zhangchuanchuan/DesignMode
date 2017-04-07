public class Main {
  public static void main(String[] args) {
    AdapterImpl ai = new AdapterImpl();
    AdapterUser user = new AdapterUser(ai);
    user.excute();
  }
}
