package Exercise7;

import javax.swing.*;

public class LibraryJOption {
    public static void main(String[] args) {
        Library library = new Library();
        library.asking = Integer.parseInt(JOptionPane.showInputDialog("Option selection: 1.Return magazines 2.Return books 3.Lost"));
        library.enterTheValue = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount borrowed"));
        JOptionPane.showMessageDialog(null,library.showOption());
    }
}
