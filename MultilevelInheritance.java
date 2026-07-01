class GrandFather {

    void land() {
        System.out.println("Land Property");
    }
}

class Father extends GrandFather {

    void house() {
        System.out.println("House Property");
    }
}

class Son extends Father {

    void car() {
        System.out.println("Car Property");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {

        Son s = new Son();

        s.land();
        s.house();
        s.car();
    }
}