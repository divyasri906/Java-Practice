class Food {
    void taste() {
        System.out.println("Normal Taste");
    }
}
public class AnonymusClass {
    public static void main(String[] args) {
        Food myOrder = new Food() {
            @Override
            void taste() {
                System.out.println("Extra Spicy Taste");
            }
        };   // <-- Semicolon is required here
        myOrder.taste();
    }
}