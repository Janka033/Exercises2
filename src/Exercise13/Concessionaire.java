package Exercise13;

import javax.swing.*;

public class Concessionaire {
    public String option,reference;

    public Object showMessage(){
        option = JOptionPane.showInputDialog("Select the make of the car (Chevrolet, Mazda or Renault):");
        if(option.equalsIgnoreCase("Chevrolet")){
            reference= "Captiva\nChevrolet is known for its lineup of robust and versatile trucks and SUVs. Some popular models include:\n" +
                    "Chevrolet Silverado: A full-size pickup truck, ideal for both work and ";
        } else if (option.equalsIgnoreCase("Mazda")) {
            reference = "Traker\nMazda stands out for producing cars with a focus on sporty design and agile driving. Some iconic models are:\n" +
                    "Mazda MX-5 Miata: A two-door convertible roadster, renowned for its agile and fun-to-drive characteristics";
        } else if (option.equalsIgnoreCase("Renault")) {
            reference = "Cybo\nRenault offers a diverse range of vehicles, from compact cars to SUVs and electric vehicles. Some notable models are:\n" +
                    "Renault Clio: A popular compact car that blends style, efficiency, and technology.";
        }else {
            JOptionPane.showMessageDialog(null,"Option incorrect");
        }
        JOptionPane.showMessageDialog(null,"\nCart information:\n"+option+"\n"+reference);
        return null;
    }
}
