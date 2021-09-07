package com.kh.hw.member.model.vo;

public class Member {

    //기본 생성자
    public Member(){

    }

    //초기값을 받는 매개변수 있는 생성자
    public String id;
    public String name;
    public String password;
    public String email;
    public char gender;
    public int age;

    public Member(String id, String name, String password, String email, char gender, int age) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    //멤버 클래스의 모든 필드값을 합쳐서 반환
    String inform() {
        //String 할때 format 쓰면 print F 처럼 하면 + + 안해도 되서 편하다
        return String.format("%s | %s | %s | %s | %c | %d ", id, name, password, email, gender, age);
    }


}
