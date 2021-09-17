package day20.api.time;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Manipulate {

    public static void main(String[] args) {

        LocalDate orderDate = LocalDate.now();
        //### 이거 넘 편해!!해당 일자에서 몇 일 뒤인지!!
        LocalDate takeDate = orderDate.plusDays(23);

        System.out.println("수령 예상일: " + takeDate);

//        orderDate.plusYears(1)
//                .plusMonths(10)
//                .plusDays(3);

        //시간도 함께 하고 싶다면?
        LocalDateTime time = LocalDateTime.now()
                .plusYears(1)
                .plusMonths(10)
                .plusDays(3)
                .plusHours(10);

        System.out.println("도서 반납 예상일 = " + time);

    }
}
