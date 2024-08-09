package com.ohgiraffers.section05.parameter;

public class Application {
    public static void main(String[] args) {
        /* 메소드의 파라미터에 대해 이해하고 사용할 수 있다. */
        /* 매개변수 사용 가능 자료형
        * 1. 기본 자료형
        * 2. 기본 자료형 배열
        * 3. 클래스 자료형
        * 4. 클래스 자료형 배열
        * 5. 가변 인자
        * */
        /* 1. 기본 자료형 */
        ParameterTest parameterTest = new ParameterTest();
        int num = 10;
        parameterTest.testPrimaryTypeParameter(num);
        System.out.println("num : " + num); //기본 자료형은 값을 참조하기 때문에 main 함수에서의 값의 변화가 없다.

        /* 2. 기본 자료형 배열 */
        int[] arr = {1,2,3,4,5};
        parameterTest.testPrimaryTypeParameter(arr);
        System.out.println("arr : " + arr[0]);  //참조 자료형은 stack 주소를 참조하기 때문에 얕은 복사가 일어난다.

        /* 3. 클래스 자료형 */
        Rectangle rectangle = new Rectangle(10, 20);

        parameterTest.testClassTypeParameter(rectangle);
        System.out.println(rectangle);  //클래스 자료형은 stack 주소를 참조하기 때문에 얕은 복사가 일어난다.

        /* 5. 기변인자
        * 인자로 전달하는 값의 개수가 정해져 있지 않은 경우 활용
        * 매개변수가 몇 개 전달될지 모르므로 반드시 매개변수 목록의 가장 뒤에 작성해야함
        * */
        parameterTest.testVariableLengthArrayParameter("홍길동");
        parameterTest.testVariableLengthArrayParameter("홍길동", "축구", "테니스");
        parameterTest.testVariableLengthArrayParameter("홍길동", new String[] {"볼링", "축구", "테니스"});    }
}
