package Exercise5;

import javax.swing.*;
import java.util.Scanner;

public class StickerAsk {
    public static void main(){
        Scanner lector = new Scanner(System.in);

        Stickers stickers= new Stickers();
        System.out.println("Sticker Size: 1.Large 2.Small");
        stickers.typeSticker = lector.nextInt();
        System.out.println("Enter the Number of stickers");
        stickers.numberOfSticker = lector.nextInt();
    }
}
