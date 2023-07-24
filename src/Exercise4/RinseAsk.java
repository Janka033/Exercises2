package Exercise4;

import java.util.Scanner;

public class RinseAsk {
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);

        Rinse rinse = new Rinse();
        System.out.println("TypeOfRinse 1.Dry cleaning 2.Normal washing 3.Ironing washing");
        rinse.typeOfRinse = lector.nextInt();
        System.out.println("Number of garments");
        rinse.numberOfGarments = lector.nextInt();
    }
}
