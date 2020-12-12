import java.util.*;
public class Main {
  static public void main(String [] args){
    //Crie o jogo criando uma árvore de eventos (Tree<Events> e passando ela para um objeto do EventHandling)
    Dialog dialog1 = new Dialog("teste1");
    Dialog dialog2 = new Dialog("teste2");
    Dialog dialog3 = new Dialog("teste3");
    Dialog dialog4 = new Dialog("teste4");
    ArrayList<String> answers = new ArrayList<>();
    answers.add("resposta 1");
    answers.add("resposta 2");
    CustomEvent CustomEvent1 = new CustomEvent("Teste 1", 0, answers, "rightDecision");

    Tree<Event> arvore = new Tree<Event>(dialog1);
    arvore.addLeaf(dialog1, dialog2);
    arvore.addLeaf(dialog2, CustomEvent1);
    arvore.addLeaf(CustomEvent1, dialog3);
    arvore.addLeaf(dialog3, dialog4);

    EventHandling newGame = new EventHandling(arvore);
    newGame.start();
  }
}
