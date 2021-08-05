package day08;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Roulette {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //인원수
        System.out.print("게임 인원 (2 ~4)명 ==> ");
        int playerNum = sc.nextInt();

        //인원수 조건
        if (playerNum < 2 || playerNum > 4) {
            System.out.println("인원수가 올바르지 않습니다. 게임 끝");
            return;
        }

        //플레이어 배열
        //배열의 크기는 참여인원만큼 설정
        String[] players = new String[playerNum];

        //참여 인원 수대로 이름을 반복 입력 받아서 플레이어 배열에 넣기
        //횟수가 지정된 반복문은 while보다 for문이 좋다.
        System.out.println("\n플레이어 이름을 등록합니다.");

                        //players.length와 동일
        for (int i = 1; i < playerNum + 1; i++) {
            System.out.printf("%d번 플레이어 이름: ", i);
//            String name = sc.next();
//            players[i-1] = name; 둘 합쳐서
            players[i-1] = sc.next();
        }
        //참여 인원 출력
        System.out.println(Arrays.toString(players) + " 참가!");

        //실탄 개수 설정
        System.out.print("\n실탄 개수 (6개 미만) => ");
        int bulletNum = sc.nextInt();
        sc.nextLine();
        //탄창 배열을 생성 (탄창공간은 6칸)
        boolean[] magazine = new boolean[6];

        System.out.printf("실탄 %d개를 넣고 탄창을 무작위로 돌립니다.", bulletNum);

        //입력된 실탄 수만큼 배열의 내부값을 true로 랜덤으로 바꿔줌.
        //랜덤값 탄창 배열의 길이만큼이니 0 이상 6 미만.
        //for 문은 랜덤 위치가 중복될 수 있으니 중복없이 장전 될때 까지 while문으로 돌린다.

        int successCount = 0; //장전이 중복없이 정확히 성공한 횟수
        while(successCount < bulletNum) {
            int position = (int) (Math.random() * 6);

            if (!magazine[position]) {//탄창이 빈 곳만 장전해라.
            magazine[position] = true;//장전
            successCount++;
            }//end if
            //if (bulletNum == successCount) break;
        }//end while



        //==================게임 시작 로직===================
        //첫번째 플레이어 랜덤으로 결젇
        //랜덤 인덱스 생성 (플레이어 수에 따라 변경)
        int turn = (int) (Math.random() * playerNum);

        System.out.printf("\n총을 돌렸습니다. %s부터 시작합니다.\n", players[turn]);

        //한 턴 내에서 해야 할 일
        /*
            1. 탄창을 돌린다: 0-5 사이의 인덱스를 랜덤 결정.
            2. 격발한다: 위에서 나온 인덱스를 통해 탄창 조회 후 실탄이 있는지 확인
            3. 사망 판정: 실탄이 있었다면 사망처리, 없었다면 넘어감.
         */

        while (true) {
            System.out.printf("\n[%s님의 턴!] 실린더를 돌립니다. \n", players[turn]);
            int bulletPosition = (int) (Math.random() * magazine.length);

            System.out.println("# 엔터를 누르면 격발합니다.");
            sc.nextLine();

            //사망 판정
            if (magazine[bulletPosition]) {
            //죽음
                System.out.printf("\n 빵!! [%s님 사망]\n", players[turn]);
                break;
            } else {
            //살았음: 턴을 넘김. 마지막 한 명은 처음으로 턴을 넘겨야 한다.
                System.out.println("휴,,살았습니다.");
                if (turn== players.length-1){
                    turn = 0;
                } else {
                    turn++;
                }
            }//end if
        }


    }//end main
}
