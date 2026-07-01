public class StringBufferMethod {
    public static void main(String[] args) {
        // Create StringBuffer object
        StringBuffer sb= new StringBuffer("Hello");
        //1.append()
        sb.append("Java");
        System.out.println("append():"+sb);
        //2.insert()
        sb.insert(5,"World");
        System.out.println("inser():" + sb);
        //3.delete()
        sb.delete(5, 11);
        System.out.println("delete():"+sb);
        //4.replace()
        sb.replace(6,10,"python");
        System.out.println("replace():"+sb);
        //5.reverse()
        sb.reverse();
        System.out.println("Reverse():"+sb);
        //6.length
        System.out.println("Length():"+sb.length());
        //7.charAt
        System.out.println("charAt():"+sb.charAt(1));


    }
}
