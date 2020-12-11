import java.util.*;

public class EventHandling {
  private ArrayList<Event> events;

  EventHandling() {
    this.events = new ArrayList<>();
  }

  public void start() {
    Scanner sc = new Scanner(System.in);
    for (Event e : events) {
      Chat.clearScreen();
      if (e instanceof Dialog) {
        Dialog t = (Dialog) e;
        Chat.newLine(t.getDialog());
        sc.nextLine();
      }
      if (e instanceof CustomEvent) {
        CustomEvent ce = (CustomEvent) e;
        Chat.newLine(ce.getDialog());
      }
      System.out.print("\n");
    }
    sc.close();
  }

  public void setEvents(ArrayList<Event> events) {
    this.events = events;
  }
}
