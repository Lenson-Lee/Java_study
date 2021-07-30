package day04;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total = 0;
        int n = 0;


        //while은 시작조건이 false면 0회 실행된다. n = 0인데 조건이 0이 아닐때 while이 돌아가서 한 번도 돌아가지 않았다.
        //실행보다 조건판단이 먼저.
        /*while (n != 0) {
            System.out.print("정수(0입력시 종료):");
            n = sc.nextInt();
            total += n;
        }
        System.out.println("입력 누적값:" + total);
        sc.close();*/

        do { //시작 조건이 false여도 최초1회 실행을 보장. 조건판단보다 실행이 먼저.
            System.out.print("정수(0입력시 종료):");
            n = sc.nextInt();
            total += n;
        } while (n != 0);

        System.out.println("입력 누적값:" + total);
        sc.close();

    }//main end
}
