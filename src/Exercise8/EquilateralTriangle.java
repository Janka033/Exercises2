package Exercise8;

public class EquilateralTriangle {
    public Integer side1;
    public Integer side2;
    public Integer side3;

    public Object itsEquilateral() {
        if (side1 == side2 && side2 == side3) {
            System.out.println("The triangle is equilateral");
        } else {
            System.out.println("The triangle it´s not equilateral");
        }
        return null;
    }
}

