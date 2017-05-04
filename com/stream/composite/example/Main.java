public class Main {
  pulic static void main(String[] args) {
    try {
      System.out.println("Making root entries...");
      Directory rootDir = new Directory("root");
      Directory binDir = new Directory("bin");
      Directory tmp = new Directory("tmp");
      Directory usr = new Directory("usr");
      rootDir.add(binDir);
      rootDir.add(tmp);
      rootDir.add(usr);
      binDir.add(new File("vi", 10000));
      binDir.add(new File("latex", 20000));
      rootDir.printList("");

      System.out.println("");
      System.out.println("Making user entries...");
      Directory yuki = new Directory("yuki");
      Directory hanako = new Directory("hanako");
      Directory tomura = new Directory("tomura");
      usr.add(yuki);
      usr.add(hanako);
      usr.add(tomura);
      yuki.add(new File("diary.html", 100));
      yuki.add(new File("Composite.java", 200));
      hanako.add(new File("memo.tex", 300));
      tomura.add(new File("game.doc", 400));
      tomura.add(new FIle("iunk.mail", 500));
      rootdir.printList("");
      
    } catch(FileTreatmentException e) {
      e.printStackTrace();
    }
  }
}
