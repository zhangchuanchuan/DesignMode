import java.util.Iterator;
public class ListVisitor extends Visitor {
  private String currentdir = "";

  public void visit(File file) {
    System.out.println(currentdir + "/" + file);
  }

  public void visit(Directory directroy) {
    System.out.println(currentdir + "/" + directory.getName());
    String savedir = currentdir;
    currentdir = currentdir + "/" + directory.getName();
    Iterator it = directory.iterator();
    while(it.hasNext()) {
      Entry entry = (Entry)it.next();
      entry.accept(this);
    }
    currentdir = savedir;
  }
}
