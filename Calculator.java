class Calculator {

    static int add(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int multi(int a, int b) {
        return a * b;
    }

    static int div(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {

        System.out.println(add(5, 3));
        System.out.println(multi(5, 3));
        System.out.println(div(5, 3));
        System.out.println(sub(5, 3));
    }
}  