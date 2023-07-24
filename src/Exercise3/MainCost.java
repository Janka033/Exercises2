package Exercise3;

import java.util.Scanner;

public class MainCost {
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);

        SendingHouse sendingHouse = new SendingHouse();
        System.out.println("Enter the cost of the house");
        sendingHouse.houseCost =lector.nextInt();
        System.out.println("Enter the property type 1.Used 2.New");
        sendingHouse.typeFurniture = lector.nextInt();


    }
}
