public class Area {

    void calculateArea(int side) {
        System.out.println("Area of Square: " + (side * side));
    }

    void calculateArea(int length, int width) {
        System.out.println("Area of Rectangle: " + (length * width));
    }

    void calculateArea(double radius) {
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }

    public static void main(String[] args) {

        Area a = new Area();

        a.calculateArea(5);       // Square 
        a.calculateArea(10, 5);    // Rectangle
        a.calculateArea(5.0);      //Circle
    }
}