abstract class Event {
  private String dialog;
  Event(String dialog){
    this.dialog = dialog;
  }
  public String getDialog() {
    return dialog;
  }
  public void setDialog(String dialog) {
    this.dialog = dialog;
  }
  @Override
  public boolean equals(Object obj) {
    return false;
  }

  @Override
  public int hashCode(){
    return dialog.hashCode();
  }
}
