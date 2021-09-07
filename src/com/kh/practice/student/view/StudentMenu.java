package com.kh.practice.student.view;

import com.kh.practice.student.Controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {

    private StudentController ssm = new StudentController();

    //생성자 alt insert 생성자명 생성안함 체크
    public StudentMenu() {
        System.out.println("=========== 학생 정보 출력 ==========");
        //student 에 return 참고
        Student[] sArr = ssm.printStudent();

        for (Student s : sArr) {
            //앞서 작성한 String inform 을 호출하면 모든 정보를 호출한다.
            System.out.println(s.inform());
        }
        System.out.println("========== 학생 성적 출력 ==========");
        //controller avgScore 참고
        double[] results = ssm.avgScore();
        System.out.println("학생 점수 합계: " + (int)results[0]); //360.0은 보기 싫으니 int로 소수 지우기
        System.out.println("학생 점수 평균: " + results[1]);

        System.out.println("========== 성적 결과 출력 ==========");
        for (Student s : sArr) {
            if (s.getScore() < ssm.CUT_LINE) {
                System.out.printf("%s학생은 재시험 대상입니다. \n", s.getName());
            } else {
                System.out.printf("%s학생은 통과입니다. \n",s.getName());
            }
        }
    }
}
