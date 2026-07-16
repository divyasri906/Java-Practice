import java.util.*;
public class ListMethod {
    public static void main(String[]args){
        List<String>list=new ArrayList<>();
        list.add("Apple");
        list.add("Orange");
        list.add("Mango");
        System.out.println("List:"+list);
        System.out.println("Sixe: "+list.size());
        System.out.println("Get :"+ list.get(1));
        list.set(1,"Banana");
        System.out.println("After set : "+ list);
        list.remove("Apple");
        System.out.println("After remove: "+list);
        System.out.println("Contains Mango:"+list.contains("Mango"));
        System.out.println("Index:"+list.indexOf("Mango"));
        System.out.println("IsEmpty:"+list.isEmpty());
        list.clear();
        System.out.println("After clear:"+ list);
    }
    
}