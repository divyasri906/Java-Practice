class cycle {
    String color = "White";
}
class Bike extends cycle {
    String color = "Black";
    void display(){
        System.out.println("Child color:"+ color);
        System.out.println("Parent color:"+super.color);
    }
}
public class Super {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.display();
    }
}