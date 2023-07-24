package Exercise3;

public class SendingHouse {
    public Integer houseCost;
    public Integer typeFurniture;
    public double ownerValue;
    public double commission;
    public Object showCost(){
        if (typeFurniture == 1) {
            commission = 0.10 * houseCost;
            ownerValue = houseCost - commission;
            System.out.println("Value received by owner: $" + ownerValue +
                    " and the Value received by the real estate: $" + commission);
        } else if (typeFurniture == 2) {
            commission = 0.12 * houseCost;
            ownerValue = houseCost - commission;
            System.out.println("Value received by owner: $" + ownerValue +
                    " and the Value received by the real estate: $" + commission);
        } else System.out.println("Error.only you can use the options 1 and 2");
        return null;
    }
}