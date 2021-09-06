package com.kh.practice.student.Controller;
import com.kh.practice.student.model.vo.Student;

public class StudentController {

//    int[] arr = new int[10];

    //===============필드 선언부=============
    private Student[] sArr = new Student[5];

    //상수 : 불변의 값    static final
    public static final int CUT_LINE = 60;

    //==========생성자 선언부=================
    public StudentController() {

        //student 배열이여서 값이 그게 들어감 int 배열에 int가 들어가듯이
        sArr[0] = new Student("김길동", "자바", 100);
        sArr[1] = new Student("박길동", "디비", 50);
        sArr[2] = new Student("이길동", "화면", 85);
        sArr[3] = new Student("정길동", "서버", 60);
        sArr[4] = new Student("홍길동", "자바", 20);
    }
    //============메서드 선언부 ============
    public Student[] printStudent() {
        return sArr;//처음에 기본값으로 null 넣어두기
    }
    public int sumScore() {
        //score가 프라이빗이어서 get사용
        int total = 0;

        for (Student student : sArr) {
            total += student.getScore();
        }
        return total;//int 일떄는 기본값 0
    }

    public double[] avgScore(){
        double[] avgArr = new double[2];

        avgArr[0] = sumScore();
        avgArr[1] = avgArr[0]/ sArr.length;

        return avgArr;
    }
}
