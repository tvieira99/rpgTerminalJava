import java.util.*;

class Player {
  private String nome;
  private Attributes attributes;
  private ArrayList<Item> items;

  Player(String nome, int strengh, int charisma, int inteligence, int luck) {
    this.nome = nome;
    this.attributes = new Attributes(strengh, charisma, inteligence, luck);
    this.items = new ArrayList<>();
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public ArrayList<Item> getItems(){
    return items;
  }

  public void setItems(ArrayList<Item> items) {
    this.items = items;
  }
}