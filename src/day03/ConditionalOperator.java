package day03;

import java.util.Scanner;

public class ConditionalOperator {
    public static void main(String[] args) {

        //스캐너 편하게 쓰는 법?
        //new Sc => javautilscanner 선택 => ctrl alt v 하면 시스템입력창만 만들면 된다.
        Scanner sc = new Scanner(System.in);


        //삼항연산자~~
        System.out.print("얼마있어?");
        int money = sc.nextInt();
//        String food = money >= 5000 ? "돈많네!육개장" : "아껴쓰자! 라면";

        //if elseif 쓰는게 더 효율적. 이건 연습.
        String food = money >= 5000? "육개장" : money >= 2500 ? "라면" : "굶어!";
        System.out.println("food = " + food);
        sc.close();

    }
}
