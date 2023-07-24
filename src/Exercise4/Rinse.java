package Exercise4;

public class Rinse {
    public Integer numberOfGarments;
    public Integer typeOfRinse;
    public int dry;

    public Integer showOption() {
        if (typeOfRinse == 1) {
            dry = 2000 * numberOfGarments;
            System.out.println("The value of the service is:" + dry);
        } else if (typeOfRinse == 2) {
            dry = 1500 * numberOfGarments;
            System.out.println("The value of the service is:" + dry);
        } else if (typeOfRinse==3) {
            dry = 1800*numberOfGarments+3000;
            System.out.println("The value of the service is:" + dry);
        } else {
            System.out.println("Value Incorrect. It.s 1.Wash or 2.Dry ");
        }
        return null;
    }
}
