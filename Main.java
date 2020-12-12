import java.util.*;
public class Main {
  static public void main(String [] args){
    //Crie o jogo criando uma árvore de eventos (Tree<Events> e passando ela para um objeto do EventHandling)
    ArrayList<String> respostas = new ArrayList<String>();
    respostas.add("Sim");
    respostas.add("Talvez");
    respostas.add("Não");
    Event a = new CustomEvent("Tudo bem?", 1, respostas, null, "Muito bem!");
    Tree<Event> arvore = new Tree<Event>(a);
    EventHandling newGame = new EventHandling(arvore);
    newGame.start();
  }
}
