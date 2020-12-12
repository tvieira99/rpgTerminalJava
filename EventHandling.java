import java.util.*;

public class EventHandling {
  Tree<Event> eventTree;

  EventHandling(Tree<Event> eventTree) {
    this.eventTree = eventTree;
  }

  public void start() {
    Scanner sc = new Scanner(System.in);
    Tree<Event> tree = this.eventTree;
    do {
      Chat.clearScreen();
      Event e = tree.getHead();
      if (e instanceof Dialog) {
        Dialog t = (Dialog) e;
        Chat.newLine(t.getDialog());
        sc.nextLine(); // ENTER PRA PASSAR DE DIÁLOGO
        Collection<Tree<Event>> sucessor = tree.getSubTrees();
        if (sucessor.size() != 1)
          System.err.print("MAIS DE UM DIALOGO PARA DIALOGO SIMPLES! SEGUINDO O CAMINHO PADRÃO!");
        tree = tree.getSucessorByIndex(0); // Seguindo o primeiro sucessor
      }
      if (e instanceof CustomEvent) {
        CustomEvent ce = (CustomEvent) e;
        Chat.newLine(ce.getDialog()); // ENTER PRA PASSAR DE DIÁLOGO
        ArrayList<String> answers = ce.getAnswers();
        Chat.newWarning("Responda apenas com número!\n");
        int option = sc.nextInt();
        while (option > answers.size() - 1) {
          Chat.clearScreen();
          for (String answer : answers) {
            Chat.newLine(answer);
          }
          option = sc.nextInt();
        }
        ce.handleEventFunction();
        tree = tree.getSucessorByIndex(option);
      }
      System.out.print("\n");
      sc.close();
    } while (tree.getSuccessors(tree.getHead()).size() == 0); // FALHA SE O NÃO HOUVER MAIS FILHO NO NÓ
  }
}
