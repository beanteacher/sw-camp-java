package section02.looping;

public class C_while {
    public void testSimpleWhileStatement() {
        /* while 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        // 초기식
        int i = 1;
        while(i <= 10) {
            System.out.println("출력 확인 " + i);
            i++;
        }
    }
}
