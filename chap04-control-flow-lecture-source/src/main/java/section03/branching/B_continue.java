package section03.branching;

public class B_continue {
    public void test() {
        for(int i = 1; i <= 100; i++) {
            if(i % 4 != 0 ||  i % 5 != 0) continue;
            System.out.println(i);
        }

    }
}
