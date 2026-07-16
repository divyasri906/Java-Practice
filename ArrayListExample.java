import java.util.*;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Orange");
        list.add("Mango");
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }                                                                                                                                                                                   
}