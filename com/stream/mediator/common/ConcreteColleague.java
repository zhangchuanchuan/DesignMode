public class ConcreteColleague extends AbsColleague {
  @Override
  public void method() {
    //调度者调用的逻辑
  }

  public void meChanged() {
    onSelfChanged();
  }

}
