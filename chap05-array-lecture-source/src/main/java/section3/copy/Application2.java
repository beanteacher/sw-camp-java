package section3.copy;

import java.util.Arrays;

public class Application2 {

    public static void main(String[] args) {
        /* 얕은 복사를 활용하여 매개변수와 리턴 값으로 활용할 수 있다. */
        String[] names = {"홍길동", "유관순", "이순신"};

        System.out.println("names 의 hashCode : " + names.hashCode());
        print(names);
        String arr[] = getAnimals();
        System.out.println("arr의 hashCode : " + arr.hashCode());

        print(arr);
    }

    public static void print(String[] arr) {
        System.out.println("arr의 hashCode : " + arr.hashCode());

        System.out.println(Arrays.toString(arr));
    }

    public static String[] getAnimals() {
        String[] animals = {"낙타", "호랑이", "나무늘보"};

        System.out.println("animals의 hashCode : "+ animals.hashCode());
        return animals;
    }

}
