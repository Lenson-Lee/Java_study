package day04;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("### 여행지 추천 프로그램 ###");
        System.out.println("[여행을 원하는 계절을 입력하세요.]");
        System.out.println(">>");
        String season = sc.next();

        //switch문에는 문자, 정수형 변수를 적습니다.
        switch (season) {
            //case문에는 switch에 작성한 변수에 들어올 값의 경우를 리터럴이나 상수형태로 작성한다.(변수x)
            case "봄": case "spring":
                System.out.println("봄에는 여의나루로 가보세요.");
                break;//switch문 종료
            case "여름": case "summer":
                System.out.println("여름에는 낙산으로 가보세요.");
                break;
            case "가을":
                System.out.println("가을에는 대청댐으로 가보세요.");
                break;
            case "겨울":
                System.out.println("겨울에는 홍천스키장으로 가보세요.");
                break;
            default: //if~else의 else역할
                System.out.println("봄,여름,가을,겨울 중에 하나를 입력하세요");
        }//end switch
        sc.close();


    }//end main
}//end class
