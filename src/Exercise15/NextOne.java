package Exercise15;
import javax.swing.JOptionPane;
public class NextOne {
     public String patterns;
     public Object showMessage(){
             patterns= "* * * * * * ==================================\n"
                    + "* * * * * ==================================\n"
                    + "* * * * * * ==================================\n"
                    + "===========================================";
         JOptionPane.showMessageDialog(null, patterns, "Next the pattern",JOptionPane.PLAIN_MESSAGE);
         return null;
     }
    }

