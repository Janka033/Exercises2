package Exercise7;

public class Library {
    public Integer asking;
    public Integer enterTheValue;
    public int result;
    public Integer showOption(){
                if (asking==1){
                    result = 500 * enterTheValue;
                    System.out.println("The price is: " + result);
                } else if (asking==2) {
                    result = 600 * enterTheValue;
                    System.out.println("The price is: " + result);
                } else if (asking==3) {
                    result = 10000*enterTheValue;
                    System.out.println("The price is " + result);
                } else {
                    System.out.println("Error");
                }return 0;
    }
}
