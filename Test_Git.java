public class Test_Git {
    public static void main(String[] args) {

        int a = 50;
        int b = 10;


        System.out.println(add(a, b));
        System.out.println(sub(a, b));
        System.out.println(mul(a, b));
        System.out.println(div(a, b));
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int sub(int a, int b) {
        return a - b;
    }

    private static int mul(int a, int b) {
        return a * b;
    }

    private static int div(int a, int b) {
        return a / b;


    }
}
