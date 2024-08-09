package section03.branching;

public class A_break {

    public void break1() {
        /* break 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        int sum = 0;
        int i = 1;
        while(true) {
            sum += i++;

            if(i==9) {
                break;
            }
        }
        System.out.println("sum = " + sum);
    }

    public void break2() {

    }
}
