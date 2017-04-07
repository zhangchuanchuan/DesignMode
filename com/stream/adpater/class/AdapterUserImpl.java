public class AdapterUserImpl {

  private AdapterInterface adapterInterface;

  public AdapterUser (AdapterInterface adapter) {
    this.adapterInterface = adapter;
  }
  
  @override
  public void excute() {
    adapter.function();
  }

}
