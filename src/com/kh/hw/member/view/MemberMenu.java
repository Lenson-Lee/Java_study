package com.kh.hw.member.view;

import com.kh.hw.member.controller.MemberController;
import day03.StdOutput;

import java.util.Scanner;

public class MemberMenu {
    //실제로는 membermenu 가 js, css, html 로 바뀔 것이다.

    private Scanner sc = new Scanner(System.in);
    private MemberController mc = new MemberController();

    public MemberMenu() {

    }

    public void mainMenu() {
        while (true) {

            System.out.printf("최대 등록 가능한 회원 수는 %d명입니다.,\n", mc.SIZE);
            //mc.SIZE에 커서 두고 ctrl alt V 하면 추출된다.
            //현재 등록된 회원 수
            int count = mc.existMemberNum();
            System.out.printf("현재 등록된 회원 수는 %d명입니다.\n", count);
            System.out.println();
            //count = 10;   //테스트용
            //1번에 커서두고 ctrl alt T 에서 if로 감싸기
            //10명 미만일 때에만 전부 보여주고 꽉 차면 1번 감추기
            if (count < mc.SIZE) {
                System.out.println("1. 새 회원 등록");
            }
            System.out.println("2. 회원 검색");
            System.out.println("3. 회원 정보 수정");
            System.out.println("4. 회원 삭제");
            System.out.println("5. 모두 출력");
            System.out.println("9. 끝내기\n");
            System.out.print("# 메뉴 번호: ");

            int menuNo = sc.nextInt();

            switch (menuNo) {
                case 1:
                    insertMember();
                    break;
                case 2:
                    searchMember();
                    break;
                case 3:

                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다");
                    System.exit(0);//프로그램 종료
                    break;
                default:
                    System.out.println("메뉴를 잘못 입력했습니다.");
            }
        }
    }

    public void insertMember() {
        System.out.println("\n# 회원가입을 시작합니다.");
        String id;
        while (true) {
            System.out.print("# 아이디: ");
            id = sc.next();

            if (mc.checkId(id)) {
                break;
            } else {
                System.out.println("아이디가 중복되었습니다. 다시 입력하세요.");
                //while true문이어서 다시 돌아가서 반복한다. true 결과인 브레이크 만날때까지.
            }
        }
        System.out.print("# 이름: ");
        String name = sc.next();

        System.out.println("# 비밀번호: ");
        String pw = sc.next();

        System.out.println("# 이메일: ");
        String em = sc.next();

        String gender;
        while (true) {
            System.out.print("# 성별(M/F): ");
            gender = sc.next();
            //toLowerCase: 대문자로 입력해도 소문자로 변경하는 함수
            //원래는 gender.toLowerCase.equals("m")이었다.
            //인텔리제가 equalsIgnoreCase를 추천해줬다!
            if (gender.equalsIgnoreCase("m") || gender.equalsIgnoreCase("f")) {
                break;
            } else {
                System.out.println("성별은 m 또는 f로만 입력하세요.");
            }
        }

        System.out.print("# 나이: ");
        int age = sc.nextInt();

        //멤버 컨트롤러의 insertMember에 넣어야 완성이다.
        mc.insertMember(id, name, pw, em, gender, age);
    }
    public void searchMember() {

    }
    public void searchId() {

    }
    public void searchName() {

    }
    public void searchEmail() {

    }

    public void updateMember() {

    }
    public void updatePassword() {

    }
    public void updateName() {

    }
    public void updateEmail() {

    }
    public void deleteMember() {

    }
    public void deleteOne() {

    }
    public void deleteAll() {

    }
    public void printAll() {

    }
}