package Exercise8;

import javax.swing.*;

public class EquilateralJOption {
    public static void main(String[] args) {
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle();
        equilateralTriangle.side1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the side 1"));
        equilateralTriangle.side2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the side 2"));
        equilateralTriangle.side3 = Integer.parseInt(JOptionPane.showInputDialog("Enter the side 3"));
        JOptionPane.showMessageDialog(null,equilateralTriangle.itsEquilateral());
    }
}
