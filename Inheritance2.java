class Employee {

    void work() {
        System.out.println("Employee is working");
    }
}

class Developer extends Employee {

    void code() {
        System.out.println("Developer is coding");
    }
}

public class Inheritance2 {
    public static void main(String[] args) {

        Developer d = new Developer();

        d.work();
        d.code();
    }
}