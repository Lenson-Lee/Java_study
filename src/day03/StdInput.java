package day03;

//1. 스캐너 api를 불러오기(문법적의미는 나중에)
import java.util.Scanner;

public class StdInput {
    public static void main(String[] args) {
        //2. 스캐너 객체 생성(준비운동 단계 딱 한 번 쓰고 두면 된다?)
        Scanner sc = new Scanner(System.in);

        //3. *중요* 스캐너가 제공하는 함수들로 입력을 처리한다
        //next(), nestLine(): 문자열 입력처리, next()는 공백입력 불가! ex) 홍    길동 ->nextLine()사용해야함
        //nextInt(), nextDouble(): 각각 정수, 실수 입력처리

        System.out.println("# 정보를 입력하세요!");
        //스캐너를 입력해서 콘솔창에 입력하고 싶다?

        System.out.print("- 이름:");
        String name = sc.next();//입력커서를 만들고 입력된 데이터를 리턴한다.

        //인텔리제의 강력한 기능~! 함수가 어떤 데이터를 리턴하는지 일일이 다 외울순 없으니~~next에 마우스를 올려보면~~ 반환하는 값의 모양을 알려준다~~
        //ctrl + alt + v 기능도 편하다.

        System.out.print("- 나이:");
        int age = sc.nextInt();

        System.out.println("==============================");
        //souf
        System.out.printf("입력된 이름은 %s이고, 나이는 %d세입니다.\n", name, age);

        //4. 스캐너 자원 메모리 해제
        sc.close(); //나중에 큰 프로그램에 해제 안하면 문제 생길 수 있으니 닫아주기 close사용하면 3번기능 못 쓰니 다 쓰고나면 꺼주기
    }}
