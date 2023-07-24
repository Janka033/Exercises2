package Exercise5;

public class Stickers {
    public Integer typeSticker;
    public Integer numberOfSticker;
    public int big;
    public int small;
    public Integer showSticker(){
        if (typeSticker==1) {
            big = 4000*numberOfSticker;
            System.out.println("The price of sticker is: " + big);
        } else if (typeSticker==2) {
            small = 6000*numberOfSticker;
            System.out.println("The price of sticker is " + small);
        }else {
            System.out.println("Error");
        }
        return null;
    }

}
