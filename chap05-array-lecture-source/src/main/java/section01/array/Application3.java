package section01.array;

public class Application3 {
    public static void main(String[] args) {
        /* 배열에 초기화 또는 자료형별 기본 값을 이해할 수 있다. */
        /* 지역 변수 (stack 영역에 할당)는 반드시 초기화해야만 접근 가능하지만
        * heap 영역에 할당 될 경우 초기값이 설정된다.
        * 정수 : 0
        * 실수 : 0.0
        * 논리 : false
        * 문자 : \00001
        * */

        int num;
//        System.out.println(num);
        
        int[] iArr = new int[10];
        for(int i = 0; i < iArr.length; i++) {
            System.out.println("iArr[" + i + "] = " + iArr[i]);
        }

    }

}
