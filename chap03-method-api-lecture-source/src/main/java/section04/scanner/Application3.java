package section04.scanner;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* 1. 공백을 포함한 문자열을 입력하게 되면 입력 버퍼에 남아있는 문자열로 인해 nextInt() 에서
        * 해당 값을 숫자로 변경하지 못해 InputTypeMismatchException 발생
        * => 공백 포함 문자열을 입력 받아야 하는 상황에서는 nextLine() 사용하기. */
        System.out.print("문자열 입력 : ");
        String input = sc.nextLine();
        System.out.println(input);

        /* 2. 입력 버퍼에 남아있는 개행문자로 인해 이어지는 nextLine()이 아무 값도 입력 받지 않고 빈 문자열로 처리된다. */
        System.out.print("숫자 입력 : ");
        int number = sc.nextInt();
        System.out.println(number);

        sc.nextLine();

        System.out.print("문자열 입력 : ");
        String input2 = sc.nextLine();
        System.out.println(input2);
    }
}
