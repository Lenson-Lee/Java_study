package com.kh.practice.student.model.vo;

public class Student {
    //다이어그램에 맞춰서 만들면 된다. -는 프라이베이트 +는 퍼블릭
    private String name;
    private String subject;
    private int score;

    //기본필드 생성자
    public Student() {

    }

//    //전부 담긴 생성자?
//    public Student(String name, String subject, int score) {
//        this.name = name;
//        this.subject = subject;
//        this.score = score;
//    }

//+++++++++++++일일히 칠 필요 없다!!++++++++++
//alt + insert 하면 생성자 만드는 툴이 나온다. ctrl + A = 전체선택
    public Student(String name, String subject, int score) {
        this.name = name;
        this.subject = subject;
        this.score = score;
    }
//setter / getter 없어도 관례적으로 만들어둔다. set만 쳐도 단축 나옴 alt insert
    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    //관례적으로 만들어야 한다.
    public String inform() {
        return this.name + " | " + this.subject + " | "+ this.score;
    }



}


