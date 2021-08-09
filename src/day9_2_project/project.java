package day9_2_project;

import java.util.Scanner;

public class project {

    //전역변수로 뺄 때는 static 사용.
    static Scanner sc = new Scanner(System.in);

    //기존에 존재하는 이이디로 로그인
    static  String guestLogin(String id) {
        String[] idArr = {"guest1","guest2"};
        String[] pwArr = {"1234", "5678"};
        String[] nickArr = {"밥그릇", "숟가락"};

        String master = "사장님";
        //사장님 pw = 0000;
        int idx = -1;

        while (true) {
            //id 인덱스 탐색
            for (int i = 0; i < idArr.length; i++) {
                if (idArr[i].equals(id)) {
                    idx = i;
                    break;
                }
            }//ID for end


        //비밀번호 일치 여부

        //동일한 인덱스의 비밀번호 배열에서 일치여부 조회
        System.out.println("비밀번호를 입력해 주세요!");
        String pw = sc.next();

            if (pwArr[idx].equals(pw) && idx != -1){ //로그인 성공
                //로그인 성공
                System.out.println(nickArr[idx] + "님 환영합니다!");
                break;
            } else { //로그인 실패
                System.out.println("비밀번호가 일치하지 않습니다! 프로그램을 종료합니다.");
                break;
            }//pw id == pw if
        }//while end
//
        return id;
    }//end guest


    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("\n++++++++++주문서 프로그램++++++++++\n");
        System.out.println("=================================");
        System.out.println("원하는 메뉴 숫자를 입력하세요!\n");
        //손님전용
        System.out.println("1. 로그인");
        System.out.println("2. 메뉴 선택");
        System.out.println("3. 요청사항 입력");
        System.out.println("4. 내 주문 기록");
        System.out.println("5. 프로그램 종료");

        System.out.print(">> ");
        int menu = sc.nextInt();

        switch (menu) {
            case 1:
                System.out.println("\n1. 로그인");
                System.out.println("id를 입력해 주세요!");
                String id = sc.next();
                guestLogin(id);
                break;
            case 2:
            System.out.println("2. 메뉴 선택");
                break;
            case 3:
            System.out.println("3. 요청사항 입력");
                break;
            case 4:
            System.out.println("4. 내 주문 기록");
                break;
            case 5:
            System.out.println("5. 프로그램 종료");
                break;
            default:
            System.out.println("# 잘못된 입력입니다. 프로그램을 종료합니다.");
                break;
        }



    }//class end
}
