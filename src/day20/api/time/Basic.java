package day20.api.time;

import java.time.*;

public class Basic {

    public static void main(String[] args) {

        //현재 날짜 정보 얻기
        LocalDate now = LocalDate.now();    //static 메서드 now 이다.
        System.out.println("now = " + now);

        //특정 날짜정보를 생성
        LocalDate targetDate = LocalDate.of(2022, 5, 21);
        System.out.println("targetDate = "+ targetDate);

        //현재 시간정보 얻기(시,분,초)
        LocalTime time = LocalTime.now();
        LocalTime timeOf = LocalTime.of(11, 50, 50);    //피시방 시간제한 같은 경우 사용
        System.out.println("time = " + time);

        //현재 날짜와 시간 정보 얻기
        LocalDateTime dateTime= LocalDateTime.now();
        System.out.println("dateTime = " + dateTime);

        //연도만 뽑고 싶다면? getter
        int year = dateTime.getYear();
        System.out.println("year = " + year);

        //월 정보 얻고싶어~~
        Month month = dateTime.getMonth();
        int monthValue = dateTime.getMonthValue();    //monthValue 는 int 로 반환해서 9월이면 9가 나온다.

        System.out.println("month = " + month);
        System.out.println("monthValue = " + monthValue);

        DayOfWeek dayOfWeek = dateTime.getDayOfWeek();
        System.out.println("요일, dayofWeek = " + dayOfWeek);
        int dayOfMonth = dateTime.getDayOfMonth();
        System.out.println("일자, dayOfMonth = " + dayOfMonth);

    }
}
