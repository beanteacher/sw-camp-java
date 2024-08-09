package com.ohgiraffers.section01.list.run;

import com.ohgiraffers.section01.list.comparator.AscendingPrice;

import java.awt.print.Book;
import java.util.*;

public class Application2 {
    public static void main(String[] args) {
        List<BookDTO> bookList =  new ArrayList<>();
        bookList.add(new BookDTO(1, "홍길동전", "허균", 50000));
        bookList.add(new BookDTO(1, "목민심서", "장덕용", 70000));
        bookList.add(new BookDTO(1, "동의보감", "허준", 30000));
        bookList.add(new BookDTO(1, "삼국사기", "김부식", 5000));
        bookList.add(new BookDTO(1, "삼국유서", "일연", 1100));

        System.out.println(bookList);
        /* implements Comparable 을 통해 compareTo 메소드가 재정의 되어야만 사용가능하다. */
        Collections.sort(bookList, new AscendingPrice());
        System.out.println(bookList);
        Collections.sort(bookList, new Comparator<>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                return o2.getPrice() - o1.getPrice();
            }
        });
        System.out.println(bookList);

        /* 제목 오름 차순 정렬 */
        bookList.sort((new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        }));

        Collections.sort(bookList);

    }
}
