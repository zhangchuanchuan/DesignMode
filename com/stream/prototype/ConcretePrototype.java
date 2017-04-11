public class ConcretePrototype implements Prototype {
  @override
  public Prototype createClone() {
    return this.clone();
  }
}
