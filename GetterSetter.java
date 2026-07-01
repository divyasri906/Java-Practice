class Student {

    private String name;

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }
}

public class GetterSetter {
    public static void main(String[] args) {

        Student s = new Student();

        s.setName("Divya Sri");      // Set value
        System.out.println(s.getName()); // Get value
    }
}