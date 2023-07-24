package Exercise3;

import javax.swing.*;

public class MainCostJpane {
    public static void main(String[] args){
        SendingHouse sendingHouse = new SendingHouse();
        sendingHouse.houseCost = Integer.parseInt(JOptionPane.showInputDialog("Enter the value of the house"));
        sendingHouse.typeFurniture = Integer.parseInt(JOptionPane.showInputDialog("Enter furniture type. 1. Used 2. New"));
        JOptionPane.showMessageDialog(null,sendingHouse.showCost());

        //System.out.println(sendingHouse.showCost());
    }
}
