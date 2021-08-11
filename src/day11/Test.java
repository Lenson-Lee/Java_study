package day11;

//다른 패키지에 있는 클래스를 불러올 때 패키지명을 생략할 수 있게 해줌
//import day11.fruit.Banana; //바나나객체를 만들때 앞의 패키지명을 생략 가능.
//import day11.fruit.Mango; //같은 패키지에 있는 객체는 임포트 안해도 된다..

//만약에 임포트 해야하는 객체가 오천만개라면? => 한번에 불러오기

import day11.fruit.*;
import day11.company.*;
import java.util.Scanner;


public class Test {

    public static void main(String[] args) {

        //day11.fruit.Banana b = new day11.fruit.Banana();
        Banana b = new Banana();//import 덕분~
        Mango mango = new Mango();
        day11.fruit.Apple apple = new day11.fruit.Apple(); //과일 애플이다.
        day11.company.Apple apple2 = new day11.company.Apple(); //회사 애플이다.

        Scanner sc = new Scanner(System.in);

        //java.util.Scanner sc = new java.util.Scanner(System.in); //원래 스캐너인데 import로 줄인거였따..
    }
}
