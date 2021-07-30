package day04;

import java.util.Scanner;

public class WhileQuuiz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("정수 1:");
        int num1 = sc.nextInt();
        System.out.println("정수 2:");
        int num2 = sc.nextInt();

        int total = 0;
//        int n = num1;
//        while(n <= num2) {
//            total += n;
//            n++;
//        }

        for(int n = num1; n <=num2; n++) {
            total += n;
        }

        System.out.printf("총 합은 %d입니다.\n", total);
    }
}
