public class AdapterUser {

  private AdapterInterface adapterInterface;

  public AdapterUser (AdapterInterface adapter) {
    this.adapterInterface = adapter;
  }

  public void excute() {
    adapter.function();
  }

}
