public abstract class Support {
  private String name;
  private Support next;

  public Support(String name) {
    this.name = name;
  }

  public Support setNext(Support next) {
    this.next = next;
    return next;
  }

  public final void support(Trouble trouble) {
    if (resolve(trouble)) {
      System.out.println(name + "解决了" + trouble.toString());
    } else {
      if (next != null) {
        next.support(trouble);
      } else {
        System.out.println("没有解决问题");
      }
    }
  }

  public abstract boolean resolve(Trouble trouble);

}
