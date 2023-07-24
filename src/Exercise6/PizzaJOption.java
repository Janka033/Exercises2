package Exercise6;

import javax.swing.*;

public class PizzaJOption {
    public static void main(String[] args) {
        PizzaShop pizzaShop = new PizzaShop();
        pizzaShop.choose = Integer.parseInt(JOptionPane.showInputDialog("Options menu: 1.Pizza 2.Sandwiches 3.salads"));
        pizzaShop.salsa = Integer.parseInt(JOptionPane.showInputDialog("Do you want to add sauce for 3000? 1.Yes 2.No"));
        pizzaShop.amount = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount"));
        JOptionPane.showMessageDialog(null,pizzaShop.showOption());
    }
}
