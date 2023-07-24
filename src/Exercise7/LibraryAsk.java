package Exercise7;

import java.util.Scanner;

public class LibraryAsk {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        Library library = new Library();
        System.out.println("Option selection: 1.Return magazines 2.Return books 3.Lost");
        library.asking = lector.nextInt();
        System.out.println("Enter the amount borrowed");
        library.enterTheValue = lector.nextInt();

    }
}
