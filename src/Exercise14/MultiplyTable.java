package Exercise14;

import javax.swing.*;

public class MultiplyTable {
    public int number,result;
    public String option;
    public Object showMessage(){
        option = JOptionPane.showInputDialog("Enter a number for the multiplication table: ");
        number = Integer.parseInt(option);
        JOptionPane.showMessageDialog(null,"Multiply Table of " + number + ":");
        for (int i = 1; i<=10; i++){
            result = number * i;
            JOptionPane.showMessageDialog(null,number + " x " + i + " = "+result);
        }
        return null;
    }
}
