import java.util.*;

class CustomEvent extends Event {
  private ArrayList<Item> items;

  CustomEvent(String dialog, ArrayList<Item> items, Boolean rightAnswer, ArrayList<String> answers) {
    super(dialog);
    this.items = items;
  }

  public String getDialog() {
    return getDialog();
  }

  public void handleEventFunction(CustomEventFunction customFunction) {
    customFunction.customEventFunction(this.items);
  }
}
