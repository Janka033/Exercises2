package Exercise10;

import javax.swing.*;

public class Asking {
    public int totalAsking=5;
    public int totalScore=0;
    public String answerCorrect = "",asking="",options="";
    public String answer;

    public Object showAsking(){
        for (int i=1; i<=totalAsking; i++) {
            switch (i) {
                case 1:
                    asking = "What is the capital of France?";
                    options = "A) London \nB) Paris\nC) Madrid";
                    answerCorrect = "B";
                    break;
                case 2:
                    asking = "What is the chemical symbol for water?";
                    options = "A) O\nB) H2O\nC) Ag";
                    answerCorrect = "A";
                    break;
                case 3:
                    asking = "What is the longest river in the world?";
                    options = "A) Nile\nB) Amazon\nC) Yangtze";
                    answerCorrect = "B";
                    break;
                case 4:
                    asking = "What year did World War II start?";
                    options = "A) 1940\nB) 1939\nC) 1945";
                    answerCorrect = "B";
                    break;
                case 5:
                    asking = "What is the largest planet in the solar system?";
                    options = "A) Earth\nB) Jupiter\nC) Mars";
                    answerCorrect = "B";
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error. question it's not invaluable");
                    System.exit(0);
            }
            answer = JOptionPane.showInputDialog("Question " + i + ": " + asking + "\n" + options);
            if (answerCorrect != null && answerCorrect.equalsIgnoreCase(answer)) {
                totalScore += 10;
            } else {
                JOptionPane.showMessageDialog(null, "Answer incorrect. Points 0");
            }
        }
        JOptionPane.showMessageDialog(null, "Total Score: " + totalScore + " points");
        return null;
    }
}
