package day05;

import java.util.Scanner;
public class LoopQuiz {
    public static void main(String[] args) {

        /*
        1. 일단 1~20의 랜덤 숫자로 두 수의 덧셈문제를 1문제 출제한 후
           정답인지 오답인지 출력해보세요.
        2. 0을 입력할 때까지 반복해서 새로운 덧셈문제를 출제하고
           지속해서 정답 오답을 출력해보세요.
        3. 프로그램 종료되면 그동안의 정답횟수와
           오답횟수를 출력하세요.
        4. 빼기 기능을 추가하세요.
        5. 곱하기 기능을 추가하세요.
        6. 만약 두번째 숫자가 더 크다면 빼기 문제를 낼 때
           양수가 나올 수 있도록 앞숫자와 교체해주세요
           ex)  4 - 17 = ?    <- 이런문제가 출제될 경우
               17 - 4 = ?      <- 이렇게 바꿔서 출제할 것!
        7. 난이도 기능을 추가하세요 [상, 중, 하]
           - 상: 1~1000사이 정수로 문제출제
           - 중: 1 ~100 사이
           - 하: 1 ~ 10 사이
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("~~~~~~~~~~~재미있는 사칙연산 게임~~~~~~~~~~~");
        System.out.println("[즐겁게 문제를 푸시다가 지겨운면 0을 누리세요]");
        System.out.println("# 엔터를 누르면 시작합니다.");
        System.out.println("=========================================");

        System.out.println("난이도를 입력하세요! [상,중,하]");
        String level = sc.next();


        int correct = 0;
        int incorrect = 0;


        int levelNum;
        switch(level) {
            case "상" :
                levelNum = 998;
                System.out.println("1부터 1000까지 범위입니다");
                break;
            case "중" :
                levelNum = 98;
                System.out.println("1부터 100까지 범위입니다");
                break;
            case "하" :
                levelNum = 8;
                System.out.println("1부터 10까지 범위입니다");
                break;
            default:
                System.out.println("난이도를 잘못 입력했습니다. 상급 난이도로 자동 시작합니다.");
                levelNum = 98;
                break;
        }


        int i;
        for (i=1; i> 0; i++) {
            int firstRange = (int)(Math.random() * levelNum) + 1;//(int)(Math.random() * levelNum) + 1;
            int lastRange = (int)(Math.random() * levelNum) + 1;//(int)(Math.random() * levelNum) + 1;

            //답 확인

            int iconNum = (int)(Math.random() * 3);
            String icon;

            if (iconNum == 0){
                icon = "+";
            } else if (iconNum == 1) {
                icon = "-";
            } else {
                icon = "x";
            }

            if (firstRange > lastRange) {
                System.out.printf("%d) %d %s %d = ?\n", i, firstRange, icon, lastRange);
            } else {
                System.out.printf("%d) %d %s %d = ?\n", i, lastRange, icon, firstRange);
            }
            int answer = firstRange + lastRange;
            switch (icon) {
                case "+":
                    answer = firstRange + lastRange;
                    break;

                case "-":
                        answer = firstRange - lastRange;
                    break;

                default:
                    answer = firstRange * lastRange;
                    break;
            }

            //사용자 입력값
            int input = sc.nextInt();

            if (input == 0) {
                System.out.println("게임을 종료합니다.");
                break;
            } else if (input == answer) {
                System.out.println("정답입니다!");
                correct++;
            } else {
                System.out.println("틀렸습니다!");
                incorrect++;
            }
        }//forend
        System.out.printf("총 횟수: 정답 %d번, 오답 %d번 입니다.", correct, incorrect);
    }//main
}
