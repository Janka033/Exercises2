package Exercise9;

import javax.swing.*;
import java.util.Scanner;

public class Voters {
    public Integer voteMaria= 0;
    public Integer voteDiego= 0;
    public String optionVote;
    public String result;
    public String winner,loser;
    public int vote;
    public Object showVoters() {
for (int i = 1; i <=10 ; i++){
    optionVote = JOptionPane.showInputDialog("Voter Number:" + i + " choose an option: 1.Maria 2.Diego");
    vote=Integer.parseInt(optionVote);
    if (vote==1){
        voteMaria++;
    } else if (vote==2) {
        voteDiego++;
    }else {
        JOptionPane.showMessageDialog(null,"Option incorrect");
    }
    result = "Voting results \n Maria:"+ voteMaria + "votes \n Diego:" +voteDiego+ "votes \n";

    if (voteMaria>voteDiego){
        winner="Maria";
        loser="Diego";
    } else if (voteMaria<voteDiego) {
        winner="Diego";
        loser="Maria";
    }else {
        winner="Tie";
        loser="Tie";
    }

    result+= "Winner:" +winner+"\n Loser:"+loser;
    JOptionPane.showMessageDialog(null,result);
}return null;
    }
}
