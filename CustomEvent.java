import java.util.*;

//USE PARA FAZER DIALOGOS COM QUESTOES. handleEventFunction tambem pode servir como trigger para uma açao personalizada
//PASSE NULL PARA NAO DEFINIR UMA FUNÇAO PERSONALIZADA
class CustomEvent extends Event {
  private ArrayList<String> answers;
  private int rightAnswer;
  private String rightDecision;
  private CustomEventFunction customEventFunction;

  public CustomEvent(String dialog, int rightAnswer, ArrayList<String> answers,
      CustomEventFunction customEventFunction, String rightDecision) {
    super(dialog);
    this.answers = answers;
    this.rightAnswer = rightAnswer;
    this.rightDecision = rightDecision;
    this.customEventFunction = customEventFunction;
  }

  public String getDialog() {
    return super.getDialog();
  }

  public CustomEventFunction handleEventFunction() {
    return this.customEventFunction;
  }

  public ArrayList<String> getAnswers() {
    return answers;
  }
  public int getRightAnswer(){
    return this.rightAnswer;
  }
  public String rightAnswer(){
    return this.rightDecision;
  }
}
