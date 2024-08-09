package section01.array;

public class Application2 {

    public static void main(String[] args) {
        /* 배열의 선언
         *  -> 선언은 stack 에 배열의 주소를 보관할 레퍼런스 변수 공간을 만드는 것.
         *  */
        int[] iArr;

        /* 선언한 레퍼런스 변수에 배열을 할당하여 대입할 수 있다.
        * new 연산자는 heap 영역에 공간을 할당하고 발생한 주소값을 반환한다.
        * 발생한 주소가 레퍼런스 변수(참조형 변수 : stack 영역)에 저장되고 이것을 참조하여 사용하기 때문에
        * 참조 자료형이라고 한다.
        * */
        iArr = new int[5];
        /* heap 메모리는 이름으로 접근하지 않고 주소로 접근하는 영역이다.
        * stack 에 저장된 주소로 heap 에 할당 된 배열을 찾아갈 수 있다. */
        System.out.println("iArr : " + iArr);
        System.out.println("iArr hashCode : " + iArr.hashCode());

        /* 배열의 길이를 알 수 있는 필드를 제공한다.
        * String 클래스의 문자열의 길이는 메소드로 제공하므로 length()로 사용하는 점에 유의한다. */
        System.out.println("iArr.length : "+ iArr.length);

        /* 한 번 지정한 배열의 길이는 변경하지 못하므로
        * 새로운 배열을 생성하여 그 주소 값을 레퍼런스 변수에 덮어 쓴다.
        *
        * 참조되지 않는 배열은 시간이 지난 후 old 영역으로 이동하여 GC(가비지 컬렉터)가 삭제한다.
        * 주소 값을 잃어버린 배열은 재참조 불가능하다.
        * */
        iArr = new int[100];
        System.out.println("수정 된 iArr : " + iArr);
        System.out.println("수정 된 iArr hashCode : " + iArr.hashCode());

        iArr = null;    // 참조하는 주소 값이 없을을 나타냄
        /* nullPointerException 발생
        * null 이라는 특수 값을 참조하고 있을 경우 참조 연산자를 사용하면 발생하는 오류 */
        System.out.println("수정 된 iArr : " + iArr);
        System.out.println("수정 된 iArr hashCode : " + iArr.hashCode());
    }
}
