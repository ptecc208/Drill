package run;

import comparator.AscendingPrice;
import dto.BookDTO;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Application2 {
    public static void main(String[] args) {
        List<BookDTO> bookDTOList = new ArrayList<>();
        bookDTOList.add(new BookDTO(1, "홍길동전", "허균", 50000));
        bookDTOList.add(new BookDTO(2, "목민심서", "정약용", 30000));
        bookDTOList.add(new BookDTO(3, "동의보감", "허준", 40000));
        bookDTOList.add(new BookDTO(4, "삼국사기", "김부식", 40000));
        bookDTOList.add(new BookDTO(5, "삼국유사", "일연", 58000));

        System.out.println(bookDTOList.size());

        for (BookDTO book : bookDTOList) {
            System.out.println(book);
        }
        bookDTOList.sort(new AscendingPrice());
        System.out.println("====================가격 오름차순==============");
        for (BookDTO book : bookDTOList) {
            System.out.println(book);
        }
        System.out.println("====================가격 내림차순==============");

        bookDTOList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                return o1.getPrice() >= o2.getPrice()? -1: 1;
            }
        });
        for (BookDTO book : bookDTOList) {
            System.out.println(book);
        }
        System.out.println("책 제목 오름차순 정렬 =======================");

        bookDTOList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });
        for (BookDTO book : bookDTOList) {
            System.out.println(book);
        }

        bookDTOList.sort((BookDTO b1, BookDTO b2) -> b2.getTitle().compareTo(b1.getTitle()));

        System.out.println("책 제목 내림차순 정렬 =======================");
        for(BookDTO book : bookDTOList) {
            System.out.println(book);
        }
    }
}
