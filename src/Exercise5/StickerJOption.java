package Exercise5;

import javax.swing.*;

public class StickerJOption {
    public static void main(String[] args) {
        Stickers stickers = new Stickers();

        stickers.typeSticker = Integer.parseInt(JOptionPane.showInputDialog("Sticker Size: 1.Large 2.Small"));

        stickers.numberOfSticker = Integer.parseInt(JOptionPane.showInputDialog("Enter the Number of stickers"));

        JOptionPane.showMessageDialog(null,stickers.showSticker());
    }
}
