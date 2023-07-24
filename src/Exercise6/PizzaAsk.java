package Exercise6;

import java.util.Scanner;

public class PizzaAsk {
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        PizzaShop pizzaShop = new PizzaShop();
        System.out.println("Options menu: 1.Pizza 2.Sandwiches 3.salads");
        pizzaShop.choose = lector.nextInt();
        System.out.println("Enter the amount");
        pizzaShop.amount = lector.nextInt();
        System.out.println("Do you want to add sauce for 3000? 1.Yes 2.No");
        pizzaShop.salsa = lector.nextInt();
    }
}
