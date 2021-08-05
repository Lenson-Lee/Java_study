package day08;

import java.util.Scanner;

public class ScannerProblem {
    public static void main(String[] args) {

//        new Scanner(Sysetem.in)
        Scanner sc = new Scanner(System.in);

        System.out.print("정수: ");
        int n = sc.nextInt();
        sc.nextLine();//17번 설명 참조.

        System.out.print("문자: ");
//        String str = sc.next(); //Hello world 입력하면 Hello만 나온다..
        String str = sc.nextLine(); //nextInt나 nextDouble이 앞에 있으면 역슬래시를 처리하는 함수가 되어버리니
        // 위에서 sc.nextLine을 한 번 실행시켜 역슬래시를 먹어준다??
        System.out.println("str = " + str);

        System.out.println("입력종료");
        sc.close();

    }//end main
}
