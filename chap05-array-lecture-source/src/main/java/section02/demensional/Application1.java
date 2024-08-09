package section02.demensional;

public class Application1 {
    public static void main(String[] args) {
        /* 다차원 배열의 구조를 이해하고 사용할 수 있다. */
        /* 1. 배열의 구조를 보관할 레퍼런스 변수 선언(stack) */
        int [][] iarr;

        /* 2. 여러 개의 1차원 배열의 주소를 관리하는 배열 생성 */
        iarr = new int[3][];    // [3][1] 배열로 heap 메모리에 생성
        // iarr = new int[][4];    // [1][4] 배열로 생성 불가능
        // 가변 배열
        iarr[0] = new int[5];
        iarr[1] = new int[25];
        iarr[2] = new int[15];
        // 정변 배열
        // iarr = new int[3][5];

        /* 4. 각 배열의 인덱스에 차례로 접근해서 값 출력 */
        for(int i = 0; i < iarr[0].length; i++) {
            System.out.print(iarr[0][i]);
        }
        System.out.println();
        for(int i = 0; i < iarr[1].length; i++) {
            System.out.print(iarr[1][i]);
        }
        System.out.println();
        for(int i = 0; i < iarr[2].length; i++) {
            System.out.print(iarr[2][i]);
        }
    }
}
