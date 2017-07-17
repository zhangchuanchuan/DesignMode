public class PageMaker {
  private PageMaker() {}

  public static void makeWelcomPage(String mailaddr, String filename) {
    try {
      Properties mailprop = Database.getProperties("maildata");
      String username = mailprop.getProperties(mailaddr);
      HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
      writer.title("Welcome to " + username + "'s page!");
      writer.paragraph("欢迎来到 blalba");
      writer.mailto(mailaddr, username);
      writer.close();
      System.out.println("完成了 blabla...")
    }
  }
}
