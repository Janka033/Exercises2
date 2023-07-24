package Exercise8;

import java.util.Scanner;

public class EquilateralAsk {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        EquilateralTriangle equilateralTriangle = new EquilateralTriangle();
        System.out.println("Angulo 1");
        equilateralTriangle.side1 = lector.nextInt();
        System.out.println("Angulo 2");
        equilateralTriangle.side2 = lector.nextInt();
        System.out.println("Angulo 3");
        equilateralTriangle.side3 = lector.nextInt();

    }
}
