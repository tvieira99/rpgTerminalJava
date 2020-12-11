public class Dialog extends Event {
  private String dialog;

  Dialog(String dialog) {
    this.dialog = dialog;
  }

  public String getDialog() {
    return dialog;
  }
}
