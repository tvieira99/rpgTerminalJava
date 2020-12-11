public class Attributes {
  private int strengh;
  private int charisma;
  private int inteligence;
  private int luck;

  Attributes(int strengh, int charisma, int inteligence, int luck){
    this.strengh = strengh;
    this.charisma = charisma;
    this.inteligence = inteligence;
    this.luck = luck;
  }
  public int getCharisma() {
    return charisma;
  }

  public int getInteligence() {
    return inteligence;
  }

  public int getLuck() {
    return luck;
  }

  public int getStrengh() {
    return strengh;
  }

  public void setStrengh(int strengh) {
    this.strengh = strengh;
  }

  public void setCharisma(int charisma) {
    this.charisma = charisma;
  }

  public void setInteligence(int inteligence) {
    this.inteligence = inteligence;
  }

  public void setLuck(int luck) {
    this.luck = luck;
  }
}
