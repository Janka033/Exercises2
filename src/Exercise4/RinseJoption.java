package Exercise4;

import javax.swing.*;

public class RinseJoption {
    public static void main(String[] args){
        Rinse rinse = new Rinse();

        rinse.typeOfRinse = Integer.parseInt(JOptionPane.showInputDialog("TypeOfRinse 1.Dry cleaning 2.Normal washing 3.Ironing washing"));
        rinse.numberOfGarments = Integer.parseInt(JOptionPane.showInputDialog("Number of garments"));
        JOptionPane.showMessageDialog(null,rinse.showOption());
    }
}
