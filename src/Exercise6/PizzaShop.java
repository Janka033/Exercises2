package Exercise6;

public class PizzaShop {
    public Integer choose;
    public Integer amount;
    public Integer salsa;
    public int result;
    public Integer showOption(){
        switch (choose){
            case 1 : {
                if (salsa==1){
                    result = 7000 * amount+3000;
                    System.out.println("The price is: " + result);
                } else if (salsa==2) {
                    result = 7000 * amount;
                    System.out.println("The price is: " + result);
                }else {
                    System.out.println("Error");
                }
            } return 0;
            case 2 : {
                if (salsa==1){
                    result = 5000*amount+3000;
                    System.out.println("The price is: " + result);
                } else if (salsa==2) {
                    result = 5000 * amount;
                    System.out.println("The price is: " + result);
                }else {
                    System.out.println("Error");
                }
            }return  0;
            case 3 : {
                if (salsa==1){
                    result = 15000*amount+3000;
                    System.out.println("The price is: " + result);
                } else if (salsa==2) {
                    result = 15000 * amount;
                    System.out.println("The price is: " + result);
                }else {
                    System.out.println("Error");
                }
            }
        }return null;
    }
}
