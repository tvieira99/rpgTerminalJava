import java.util.*;

class CustomEvent extends Event {
  private String dialog;
  private String customEvent;
  private Boolean flag;

  CustomEvent(String dialog, String customEvent){
    this.dialog = dialog;
    this.customEvent = customEvent;
  }

  public String getDialog() {
    return dialog;
  }

  public Boolean executeEvent() {
    Scanner sc = new Scanner(System.in);
    System.out.print("\n");
    System.out.print("* Digite a resposta: (y/n)");
    String str = sc.next();
    if(str.equals("y") || str.equals("Y")){
      flag = true;
      System.out.print(str);
    }
    else{
      flag = false;
      System.out.print(str);
    }
    sc.close();
    return flag;
  }
}
