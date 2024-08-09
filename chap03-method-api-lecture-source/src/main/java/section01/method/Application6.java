package section01.method;

public class Application6 {
    public static void main(String[] args) {
        int a = 100;
        int b = 20;

        Application6 a6 = new Application6();
        System.out.println(a6.plus(a, b));
        System.out.println(a6.minus(a, b));
        System.out.println(a6.multiply(a, b));
        System.out.println(a6.divide(a, b));
        System.out.println(a6.mod(a, b));

    }
    public int plus(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public int mod(int a, int b) {
        return a % b;
    }
}
