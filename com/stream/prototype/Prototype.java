//注意 Cloneable是浅复制，只是将字段值直接复制到克隆的实例中，所以对于引用对象来说还是同一个实例，如果要实现
//深复制，则需自己重写clone方法来实现！！！
public interface Prototype extends Cloneable {
  public abstract Prototype createClone();
}
