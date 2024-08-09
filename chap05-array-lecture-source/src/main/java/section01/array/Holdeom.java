package section01.array;

import java.util.*;

public class Holdeom {

    public static void main(String[] args) {

        Random random = new Random();

        String[] shape = {"SPADE" , "HEART", "DIAMOND", "CLOVER"};
        String[] cardNumber = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"};

        Stack<String> trumpCard = new Stack<>();
        for(int i = 0; i < shape.length; i++) {
            for(int j = 0; j < cardNumber.length; j++) {
                trumpCard.add(shape[i] + " " +cardNumber[j]);
            }
        }

        Collections.shuffle(trumpCard);

        System.out.println(trumpCard);
        Scanner scanner = new Scanner(System.in);
        System.out.print("플레이어 수를 입력해주세요. : ");
        int playerNum = scanner.nextInt();

        String[] communityCard = new String[5];
        String[][] playerCard = new String[playerNum][2];

        for(int i = 0; i < playerNum; i++) {
            for(int j = 0; j < 2; j++) {
                playerCard[i][j] = trumpCard.pop();
            }
            System.out.println(Arrays.toString(playerCard[i]));
        }

        for (int i = 0; i < communityCard.length; i++) {
            communityCard[i] = trumpCard.pop();
        }
        System.out.println(Arrays.toString(communityCard));

    }
}
