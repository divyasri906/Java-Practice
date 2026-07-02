class A {
    void show() {
        class B {
            void display() {
                System.out.println("Hello from Local Inner Class");
            }
        }
        B b = new B();
        b.display();
    }
}
public class LocalInnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
    }
}