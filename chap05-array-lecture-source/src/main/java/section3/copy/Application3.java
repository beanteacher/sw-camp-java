package section3.copy;

import java.util.Arrays;

public class Application3 {
    public static void main(String[] args) {
        /* 깊은 복사를 이해하고 활용할 수 있다. */
        int[] orgArr = {1,2,3,4,5};
        print(orgArr);

        /* 1. for문 */
        int[] copyArr = new int[10];

        for(int i = 0; i < orgArr.length; i++) {
            copyArr[i] = orgArr[i];
        }

        print(copyArr);

        /* 2. Object 의 clone() */
        int[] copyArr2 = orgArr.clone();

        print(copyArr2);

        /* 3. System 의 arraycopy() */
        int[] copyArr3 = new int[10];
        System.arraycopy(orgArr, 0, copyArr3, 3, orgArr.length);

        print(copyArr3);

        /* 4.Arrays.copy */
        int[] copyArr4 = Arrays.copyOf(orgArr, 10);

        print(copyArr4);

        int[] copyArr5 = Arrays.copyOf(orgArr, 3);

        print(copyArr5);
    }

    public static void print(int[] arr) {
        System.out.println("hashCode : " + arr.hashCode());

        System.out.println(Arrays.toString(arr));
    }
}
