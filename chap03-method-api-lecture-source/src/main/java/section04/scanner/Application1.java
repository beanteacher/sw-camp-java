package section04.scanner;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        /* java.util.Scanner */

        Scanner scanner = new Scanner(System.in);
        /* 2-1. 문자열 입력 : nextLine() */
        System.out.print("이름 입력 : ");
        String name = scanner.nextLine();
        scanner.close();
        System.out.println("입력 받은 값 : " + name);

        /* 2-2. 정수형 입력 : nextInt()
        * 숫자가 아닌 값을 입력하며 or int 범위를 벗어나는 값을 입력하면
        * java.util.InputMismatchException 이 발생 (런타임 에러) */
        System.out.print("나이 입력 : ");
        int age = scanner.nextInt();
        System.out.println("입력 받은 값 : " + age);

        /* 2-3. 실수형 입력 : nextDouble()
        * 정수 값 입력은 실수로 반환되지만 숫자가 아닌 값을 입력하면
        * java.util.InputMismatchException 발생 (런타임 에러) */
        System.out.print("키 입력 : ");
        double height = scanner.nextDouble();
        System.out.println("입력받은 값 : " + height);

        /* 2-4. 논리값 입력 */
        System.out.print("참과 거짓 중 하나를 true or false 로 입력 : ");
        boolean isTrue = scanner.nextBoolean();
        System.out.println("입력 받은 값 : " + isTrue);

        /* 2-5. 문자값 입력 */
        System.out.print("아무 문자나 입력 : ");
        char ch = scanner.next().charAt(5);
        System.out.println(ch);
    }
}
