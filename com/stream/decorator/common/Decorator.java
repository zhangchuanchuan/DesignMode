public abstract class Decorator extends Display {
  protected Component component;
  protected Decorator(Component component) {
    this.component = component;
  }
}
