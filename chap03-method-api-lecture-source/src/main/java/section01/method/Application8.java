package section01.method;

public class Application8 {
    public static void main(String[] args) {
        /* 다른 클래스에 작성 된 메소드를 호출할 수 있다. */

        int a = 10;
        int b = 30;

        /* 1. non-static 메소드 호출 */
        Calculator calculator = new Calculator();
        System.out.println("최소값 : " + calculator.min(a, b));

        /* 2. static 메소드 호출*/
        System.out.println("최대값 : " + Calculator.max(a, b));

        /* 주의. static 메소드를 non-static 메소드처럼 호출할 수 있으나 권장하지 않는다. */
        System.out.println(calculator.max(a, b));
    }
}
