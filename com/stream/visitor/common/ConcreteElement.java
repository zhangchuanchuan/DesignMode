public class ConcreteElement extends Element {
  public void accept(Visitor v) {
    v.visit(this);
  }
}
