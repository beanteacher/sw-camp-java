package section01.array;

public class Application1 {
    public static void main(String[] args) {
        /* 배열의 선언 및 할당 */
         int[] array = new int[5];

         /* 하나의 이름으로 관리되는 연속된 메모리 공간이며, 해당 공간을 찾아갈 인덱스가 있다. */
        for(int i = 0; i < 5; i++) {
            array[i] = i + 1;
        }

        for(int j = 0; j < 5; j++) {
            System.out.println(array[j]);
        }

        /* 향상된 for 문
        * 배열의 인덱스의 값을 꺼내서 int j 라는 변수에 담아서 사용하는 맥락으로
        * j에 값을 담더라도 배열에 변화는 없다. -> 참조가능하나 값 변경은 불가
        * */
        int sum = 0;
        for(int j : array) {
            System.out.println(" j = " + j);
            sum += j;
        }
    }
}
