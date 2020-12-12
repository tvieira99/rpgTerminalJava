import java.util.*;

//USE PARA FAZER DIÁLOGOS COM QUESTÕES. handleEventFunction também pode servir como trigger para uma ação personalizada
//PASSE NULL PARA NÃO DEFINIR UMA FUNÇÃO PERSONALIZADA
class CustomEvent extends Event {
  private ArrayList<String> answers;
  private CustomEventFunction customEventFunction;

  public CustomEvent(String dialog, Boolean rightAnswer, ArrayList<String> answers,
      CustomEventFunction customEventFunction) {
    super(dialog);
    this.answers = answers;
    this.customEventFunction = customEventFunction;
  }

  public String getDialog() {
    return getDialog();
  }

  public CustomEventFunction handleEventFunction() {
    return this.customEventFunction;
  }

  public ArrayList<String> getAnswers() {
    return answers;
  }
}
