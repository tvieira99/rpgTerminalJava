import java.util.*;

//USE PARA FAZER DIALOGOS COM QUESTOEs
class CustomEvent extends Event {
  private ArrayList<String> answers;
  private int rightAnswer;
  private String rightDecision;
  private String wrongDecision;

  public CustomEvent(String dialog, int rightAnswer, ArrayList<String> answers,
   String rightDecision, String wrongDecision) {
    super(dialog);
    this.answers = answers;
    this.rightAnswer = rightAnswer;
    this.rightDecision = rightDecision;
    this.wrongDecision = wrongDecision;
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
  public String getWrongDecision(){
    return this.wrongDecision;
  }
}
