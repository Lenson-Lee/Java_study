package com.kh.hw.member.view;

import com.kh.hw.member.controller.MemberController;

import java.util.Scanner;

import com.kh.hw.member.model.vo.Member;
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

            System.out.printf("\n최대 등록 가능한 회원 수는 %d명입니다.,\n", mc.SIZE);
            //mc.SIZE에 커서 두고 ctrl alt V 하면 추출된다.
            //현재 등록된 회원 수
            int count = mc.existMemberNum();
            System.out.printf("현재 등록된 회원 수는 %d명입니다.\n", count);
            System.out.println();
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
                    updateMember();
                    break;
                case 4:
                    deleteMember();
                    break;
                case 5:
                    printAll();
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
                System.out.println("성별은 m 또는 f로만 입력하세요.");  //제대로 입력까지 무한반복.
            }
        }

        System.out.print("# 나이: ");
        int age = sc.nextInt();

        //멤버 컨트롤러의 insertMember에 넣어야 완성이다.
        mc.insertMember(id, name, pw, em, gender, age);
    }

    //검색 메뉴 철력 메서드
    public void searchMember() {
        while (true) {
            System.out.println("\n=============== 검색 메뉴 ===============");
            System.out.println("# 1. 아이디로 검색");
            System.out.println("# 2. 이름으로 검색");
            System.out.println("# 3. 이메일로 검색");
            System.out.println("# 9. 메인으로 돌아가기");
            System.out.print("# 메뉴 입력: ");
            int menuNo = sc.nextInt();

            switch (menuNo) {
                case 1:
                    searchId();
                    break;
                case 2:
                    searchName();
                    break;
                case 3:
                    searchEmail();
                    break;
                //메인으로 돌아가도록 리턴
                case 9:
                    return;
                default:
                    System.out.println("잘못 입력하였습니다. 다시 입력해 주세요.");
            }
        }
    }

    //아이디를 입력할 수 있는 창을 만들어주는 메서드
    public void searchId() {
        System.out.print("\n# 아이디를 입력: ");
        String findId = sc.next();
        //컨트롤러의 searchId필요
        Member member = mc.searchId(findId);

        if (member != null) {
            System.out.println("\n=========== 조회 결과=============");
            System.out.println(member.inform());
        } else {
            System.out.println("\n# 조회하신 회원은 없는 회원입니다.");
        }
    }

    public void searchName() {
        System.out.print("\n# 이름을 입력: ");
        String findName = sc.next();

        Member[] members = mc.searchName(findName);

        if (members.length != 0) {
            System.out.println("\n=========== 조회결과 ===========");
            for (Member member : members) {
                System.out.println(member.inform());
            }
        } else {
            System.out.println("\n# 조회하신 회원은 없는 회원입니다.");
        }
    }

    public void searchEmail() {
        System.out.print("\n# 이메일을 입력: ");
        String findEmail = sc.next();
        Member member = mc.searchEmail(findEmail);
        if (member != null) {
            System.out.println("\n======= 조회 결과 ========");
            System.out.println(member.inform());
        } else {
            System.out.println("\n# 조회하신 회원은 없는 회원입니다.");
        }
    }

    //회원 정보 수정 메뉴를 출력하는 메서드
    public void updateMember() {
        while (true) {
            System.out.println("\n=============== 수정 메뉴 ===============");
            System.out.println("# 1. 비밀번호 수정하기");
            System.out.println("# 2. 이름 수정하기");
            System.out.println("# 3. 이메일 수정하기");
            System.out.println("# 9. 메인으로 돌아가기");
            System.out.print("# 메뉴 입력: ");
            int menuNo = sc.nextInt();

            switch (menuNo) {
                case 1:
                    updatePassword();
                    break;
                case 2:
                    updateName();
                    break;
                case 3:
                    updateEmail();
                    break;
                case 9:
                    return;//메인으로 돌아가도록 리턴
                default:
                    System.out.println("잘못 입력하였습니다. 다시 입력해 주세요.");
            }
        }
    }

    //회원의 비밀번호를 바꾸기 위해 사용할 메서드
    private void updatePassword() {
        System.out.println("\n# 비밀번호를 변경합니다.");
        System.out.println("# 아이디를 입력: ");
        String id = sc.next();

        Member member = mc.searchId(id);
        if (member == null) {
            System.out.println("\n# 존재하지 않는 회원입니다.");
        } else {
            System.out.printf("# %s님의 비밀번호를 변경합니다.\n", member.getName());
            System.out.print("# 새로운 비밀번호: ");
            String newPw = sc.next();

            if (mc.updatePassword(id, newPw)) {
                System.out.println("\n# 비밀번호 변경에 성공했습니다.");
            } else {
                System.out.println("\n# 비밀번호 변경에 실패했습니다.");
            }
        }
    }

    public void updateName() {
        System.out.println("\n# 이름을 변경합니다.");
        System.out.println("# 아이디를 입력: ");
        String id = sc.next();

        Member member = mc.searchId(id);
        if (member == null) {
            System.out.println("\n# 존재하지 않는 회원입니다.");
        } else {
            System.out.printf("# %s님의 이름을 변경합니다.\n", member.getName());
            System.out.print("# 새로운 이름: ");
            String newNm = sc.next();

            if (mc.updateName(id, newNm)) {
                System.out.println("\n# 이름 변경에 성공했습니다.");
            } else {
                System.out.println("\n# 이름 변경에 실패했습니다.");
            }
        }
    }

    public void updateEmail() {
        System.out.println("\n# 이메일을 변경합니다.");
        System.out.print("# 아이디를 입력: ");
        String id = sc.next();

        Member member = mc.searchId(id);
        if (member == null) {
            System.out.println("\n# 존재하지 않는 회원입니다.");
        } else {
            System.out.printf("# %s님의 이메일을 변경합니다.\n", member.getName());
            System.out.print("# 새로운 이메일: ");
            String newEm = sc.next();

            if (mc.updateEmail(id, newEm)) {
                System.out.println("\n# 이메일 변경에 성공했습니다.");
            } else {
                System.out.println("\n# 이메일 변경에 실패했습니다.");
            }
        }
    }

    public void deleteMember() {
        while (true) {
            System.out.println("\n=============== 삭제 메뉴 ===============");
            System.out.println("# 1. 특정 회원 삭제하기");
            System.out.println("# 2. 모든 회원 삭제하기");
            System.out.println("# 9. 메인으로 돌아가기");
            System.out.print("# 메뉴 입력: ");
            int menuNo = sc.nextInt();

            switch (menuNo) {
                case 1:
                    deleteOne();
                    break;
                case 2:
                    deleteAll();
                    break;
                case 9:
                    return;//메인으로 돌아가도록 리턴
                default:
                    System.out.println("잘못 입력하였습니다. 다시 입력해 주세요.");
            }
        }
    }
    //=========================================================================================================
    //한 명의 정보만 삭제하는 메서드
    public void deleteOne() {
        System.out.print("# 삭제할 회원 id를 입력 : ");
        String id = sc.next();

        mc.delete(id);
    }//deleteOne end
    //=========================================================================================================

    public void deleteAll() {
        System.out.println("\n# 정말로 전체 삭제하시겠습니까? [y/n]");
        String check = sc.next();
        if (check.equalsIgnoreCase("y")){
            mc.delete();
        } else {
           System.out.println("잘못 입력하였습니다. 메뉴로 돌아갑니다.");
        }
    }

    //모든 회원 정보를 출력하는 메서드
    public void printAll() {

        Member[] members = mc.printAll();
        int count = mc.existMemberNum();

        if (count == 0) {
            System.out.println("\n# 저장된 회원이 없습니다.");
        } else {
            System.out.println("\n==================== 전체 회원 정보 ======================");
            for (int i = 0; i < count; i++) {
                System.out.println(members[i].inform());
            }
        }
    }
}


