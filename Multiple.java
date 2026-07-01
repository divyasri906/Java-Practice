interface Father1 {
    void study();
}

interface Mother1 {
    void cleaning();
}

class Student implements Father1, Mother1 {
    public void study() {
        System.out.println("I am studying");
    }

    public void cleaning() {
        System.out.println("I am cleaning");
    }
}

public class Multiple {
    public static void main(String[] args) {
        Student s = new Student();
        s.study();
        s.cleaning();
    }
}