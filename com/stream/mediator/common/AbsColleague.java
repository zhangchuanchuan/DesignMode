public class AbsColleague implements Colleague {
  private Mediator mediator;
  public void setMediator (Mediator mediator) {
    this.mediator = mediator;
  }

  public void onSelfChanged() {
    mediator.colleagueChanged();
  }

}
