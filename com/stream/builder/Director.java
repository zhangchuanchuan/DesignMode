public class Director {
  private Builder builder;

  public Director (Builder builder) {
    this.builder = builder;
  }

  public void consctract(){
    builder.method1();
    builder.method2();
  }

}
