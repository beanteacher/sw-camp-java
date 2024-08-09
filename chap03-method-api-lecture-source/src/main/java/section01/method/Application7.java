package section01.method;

public class Application7 {
    public static void main(String[] args) {
        /* static 메소드를 호출할 수 있다. */

        int a = 100;
        int b = 20;
        /* 동일 클래스 내에서 static 메소드 호출 시 클래스명 생략 가능 */
        System.out.println(plus(a, b));
//      Application6.main();

    }

    public static int plus(int a, int b) {
        return a + b;
    }
}
