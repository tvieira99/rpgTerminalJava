import java.util.*;

//USE PARA FAZER DIALOGOS COM QUESTOES. handleEventFunction tambem pode servir como trigger para uma açao personalizada
//PASSE NULL PARA NAO DEFINIR UMA FUNÇAO PERSONALIZADA
class CustomEvent extends Event {
  private ArrayList<String> answers;
  private int rightAnswer;
  private String rightDecision;

  public CustomEvent(String dialog, int rightAnswer, ArrayList<String> answers,
   String rightDecision) {
    super(dialog);
    this.answers = answers;
    this.rightAnswer = rightAnswer;
    this.rightDecision = rightDecision;
  }

  public String getDialog() {
    return super.getDialog();
  }

  public ArrayList<String> getAnswers() {
    return answers;
  }
  public Integer getRightAnswer(){
    return this.rightAnswer;
  }
  public String rightAnswer(){
    return this.rightDecision;
  }
}
