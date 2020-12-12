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
      // Chat.clearScreen();
      Event e = tree.getHead();
      if (e instanceof Dialog) {
        Dialog t = (Dialog) e;
        Chat.newLine(t.getDialog());
        sc.nextLine(); // ENTER PRA PASSAR DE DIALOGO
        System.out.println("");
        Collection<Tree<Event>> sucessor = tree.getSubTrees();
        if (sucessor.size() != 1)
          System.err.print("MAIS DE UM DIALOGO PARA DIALOGO SIMPLES! SEGUINDO O CAMINHO PADRÃO!");
        tree = tree.getSucessorByIndex(0); // Seguindo o primeiro sucessor
      }
      if (e instanceof CustomEvent) {
        CustomEvent ce = (CustomEvent) e;
        Chat.newLine(ce.getDialog()); // ENTER PRA PASSAR DE DIALOGO
        ArrayList<String> answers = ce.getAnswers();
        Integer option = -1;
        for (String answer : answers) {
          Chat.newLine(answer);
        }
        System.out.println();
        Chat.newWarning("Escolha uma resposta digitando o número da posição dela!\n");
        while (true) {
          option = sc.nextInt();
          option -= 1; //Para começar do 1
          sc.nextLine(); //Necessário para o próximo diálogo não receber a nova linha ser pulado
          if (ce.getRightAnswer() == option) {
            Chat.newLine(ce.rightAnswer());
            break;
          }else{
            Chat.newLine("Tente Novamente!");
            System.out.println("");
          }
        }
        tree = tree.getSucessorByIndex(option);
      }
    }while(tree.getSubTrees().size() != 0);// FALHA SE O NAO HOUVER MAIS FILHO NO NO
    sc.close();
  }
}
