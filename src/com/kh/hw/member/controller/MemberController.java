package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

import java.util.Scanner;

public class MemberController {

    Scanner sc = new Scanner(System.in);

    private Member[] m = new Member[SIZE];
    public static final int SIZE = 10;

    public MemberController() {
        m[0] = new Member("abc", "김철수", "1234", "abc@gmail.com", 'm', 35);
        m[1] = new Member("2bc", "김철수", "1234", "2bc@gmail.com", 'm', 35);
        m[2] = new Member("3bc", "조영희", "1234", "3bc@gmail.com", 'm', 35);
    }

    //실제 저장된 회원의 숫자를 반환
    public int existMemberNum() {
        //return m.length; = 저장이 되어있지 않아도 배열 크기가 10으로 정해져있어서 공간이 null로 차있어 소용이 없다.
        int count = 0; //숫자를 세는 변수
        for (int i = 0; i < m.length; i++) {
            if (m[i] == null) {
                break;
            }
            count++;
        }
        return count;
    }

    //아이디 중복 체크 메서드
    public boolean checkId(String inputId) {
        //ita 단축
        if (existMemberNum() > 0) {
            for (Member member : m) {
                if (member == null) break;
                if (inputId.equals(member.getId())) {
                    //리턴을 안만났다는것은 한 번도 겹치는 아이디가 없었다는 말 : 중복이 없다.
                    return false;//중복
                }
            }
        }
        return true;//중복 안됨.가입 허락
    }

    //멤버 객체를 객체 배열에 저장하는 메소드
    public void insertMember(String id, String name, String password, String email, String gender, int age) {

        //charAt(index) : 문자열에서 해당 위치의 하나의 글자를 추출
        //Member( ctrl + p 하면 순서 알려줌)
        //한 명도 가입 안되어있으면 exMbNum 에서 0이 나오니 써먹으면 된다.
        //int count = existMemberNum();
        //m[count]로 써도 된다. 한 줄로 쓰고싶으면 밑에처럼 쓰면 되고,
        m[existMemberNum()] = new Member(id, name, password, email, gender.charAt(0), age);
    }

    //아이디를 입력하면 그 아이디에 해당하는 회원 1명의 정보 리턴
    public Member searchId(String id) {

        for (int i = 0; i < existMemberNum(); i++) {
            if (id.equals(m[i].getId())) {
                return m[i];
            }
        }
        //for문에서 정보가 없는 경우 null/ 무조건 멤버를 반환해야하는데 for문이 운 좋게 if문에 걸리면 m 반환하는데 안걸리면 null이라도 걸어야해서.
        //else { return new Member()}같은거라도 만들어야하는데...못찾았는데 굳이 새 걸 반환해도 똑같으니 null 올리기
        return null;
    }

    //이름을 입력하면 그 아이디에 해당하는 회원'들'의 정보 리턴(동명이인이 있을 수 있어서)
    public Member[] searchName(String name) {

        //이름이 일치하는 회원들을 저장할 배열
        Member[] foundMembers = {};

        for (int i = 0; i < existMemberNum(); i++) {

            if (name.equals(m[i].getName())) {
                //6일차 배열에서 array, push 알고리즘 사용해야한다. //
                foundMembers = pushMember(foundMembers, m[i]);  //뫄뫄를 발견 -> foundmembers배열에 pushmem으로 m[i]번째로 칸을 늘려서 밀어넣는다? 그리고 다시 foundmembers로 갱신해주는 과정이다.
            }
        }
        return foundMembers;
    }

    //멤버 배열에 데이터를 추가하는 배열을 리턴하는 메서드
    private Member[] pushMember(Member[] targets, Member newMember) {

        //1. 원본 배열보다 사이즈가 1개 더 큰 새 배열 생성
        Member[] temp = new Member[targets.length + 1];

        //2. 기존 배열 데이터를 복사해서 신규 배열로 이동
        for (int i = 0; i < targets.length; i++) {
            temp[i] = targets[i];
        }

        //3. 추가한 어..day6참조
        temp[temp.length - 1] = newMember;
        return temp;
    }

    //이메일을 입력하면 그 아이디에 해당하는 회원 1명의 정보 리턴
    public Member searchEmail(String email) {
        for (int i = 0; i < existMemberNum(); i++) {
            if (email.equals(m[i].getEmail())) {
                return m[i];
            }
        }
        return null;
    }

    //비밀번호 변경 메소드
    public boolean updatePassword(String id, String password) {
        Member member = searchId(id);
        if (member != null) {
            member.setPassword(password);
            return true;
        } else {
            return false;
        }
    }//end updatePassword

    //이름 변경 메소드
    public boolean updateName(String id, String name) {
        Member member = searchId(id);
        if(member != null) {
            member.setName(name);
            return true;
        } else {
            return false;
        }
    }//end updateName

    //이메일 변경 메소드
    public boolean updateEmail(String id, String email) {
        Member member = searchId(id);
        if(member != null) {
            member.setEmail(email);
            return true;
        } else {
            return false;
        }
    }
    //=========================================================================================================
    //한 회원만 삭제하는 메소드 + 가장 어려울듯하다.
    public boolean delete(String id) {
        Member member = searchId(id);
        if(member != null) {
            return true;
        } else {
            return false;
        }
    }
    //=========================================================================================================

    //전체 회원을 삭제하는 메소드
    public void delete() {
        for (int i = 0; i < m.length; i++) {
            m[i] = null;
        }
    }

    //Member 객체 반환 메소드
    public Member[] printAll() {
        return m;
    }


}
