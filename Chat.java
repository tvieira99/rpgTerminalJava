public class Chat {
  public static void clearScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }
  public static void newLine(String s){
    System.out.print(">>> ");
    System.out.print(s);
  }
  public static void newWarning(String s){
    System.out.print("\n[AVISO]" + s);
  }
}
