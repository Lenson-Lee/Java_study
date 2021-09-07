package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;
import java.util.Scanner;

public class MemberController {

    Scanner sc = new Scanner(System.in);

    private Member[] m = new Member[SIZE];
    public static final int SIZE = 10;

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
    public void insertMember(String id, String name, String password, String email, String gender, int age){

        //charAt(index) : 문자열에서 해당 위치의 하나의 글자를 추출
        //Member( ctrl + p 하면 순서 알려줌)
        //한 명도 가입 안되어있으면 exMbNum 에서 0이 나오니 써먹으면 된다.
        //int count = existMemberNum();
        //m[count]로 써도 된다. 한 줄로 쓰고싶으면 밑에처럼 쓰면 되고,
        m[existMemberNum()] = new Member(id, name, password, email, gender.charAt(0), age);
    }

    //아이디를 입력하면 그 아이디에 해당하는 회원 1명의 정보 리턴
    public Member searchId(String id) {

        for (int i = 0; i < m.length; i++) {
            Member member = m[i];

            if (id.equals(member.getId())) {

            }
        }
        return null;
    }
    //이름을 입력하면 그 아이디에 해당하는 회원들의 정보 리턴(동명이인이 있을 수 있어서)
    public Member[] searchName(String name) {
        return null;
    }
    //이메일을 입력하면 그 아이디에 해당하는 회원 1명의 정보 리턴
    public Member searchEmail(String email) {
        return null;
    }
    //비밀번호 변경 메소드
    public boolean updatePassword(String id, String password) {
        return false;
    }
    //이름 변경 메소드
    public boolean updateName(String id, String name) {
        return false;
    }
    //이메일 변경 메소드
    public boolean updateEmail(String id, String email) {
        return false;
    }
    //한 회원만 삭제하는 메소드
    public boolean delete(String id) {
        return false;
    }
    //전체 회원을 삭제하는 메소드
    public void delete() {

    }
    //Member 객체 반환 메소드
    //public Member[] printAll()




}
