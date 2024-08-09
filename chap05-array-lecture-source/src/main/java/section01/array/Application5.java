package section01.array;

import java.util.*;

public class Application5 {

    private static Random random = new Random();

    public static void main(String[] args) {

        /* 랜덤한 카드 뽑아서 한 장 출력 */
        String[] shape = {"SPADE" , "HEART", "DIAMOND", "CLOVER"};
        String[] cardNumber = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"};

        int randomShapeIndex = (int) (Math.random() * shape.length);
        int randomCardNumberIndex = (int) (Math.random() * cardNumber.length);

        System.out.println(shape[randomShapeIndex] + " " + cardNumber[randomCardNumberIndex]);
    }


}
