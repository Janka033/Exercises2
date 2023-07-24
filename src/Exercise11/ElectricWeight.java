package Exercise11;
import javax.swing.*;
import java.util.Scanner;
public class ElectricWeight {
    public int priceService = 500;
    public int totalEntered;
    public int payment,refund;
    public String  option;
    public Object showMessage(){
        while (totalEntered<priceService) {
            option =JOptionPane.showInputDialog("Enter the value of your payment (500, 1000, 2000 or 5000): ");
            payment = Integer.parseInt(option);
                if (payment == 500 || payment == 1000 || payment == 2000 || payment == 5000) {
                    totalEntered += payment;
                } else {
                    JOptionPane.showMessageDialog(null,"Invalid payment value. Only 500 and 1000 coins or 2000 and 5000 bills are accepted.");
                }
            }

            refund = totalEntered - priceService;
            if (refund > 0) {
                JOptionPane.showMessageDialog(null,"Successful payment. Return: " + refund + " pesos.");
            } else {
                JOptionPane.showMessageDialog(null,"successful payment. No return required.");
            }

            JOptionPane.showMessageDialog(null,"come back soon");
        return null;
    }
    }

