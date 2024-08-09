package section02.demensional;

public class Application2 {

    /* 2차원 가변 배열을 선언 및 할당하여 사용할 수 있다. */

    /* 가변 배열의 경우 각 인덱스별 배열을 따로 할당해야 한다. */

    public static void main(String[] args) {

        int[][] arr = new int[3][];

        arr[0] = new int[4];
        arr[1] = new int[5];
        arr[2] = new int[7];

        int value = 1;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = value++;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
