package day07;

import java.util.Arrays;
import java.util.Scanner;
public class ArrayDeleteQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] student = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};

        System.out.println("* 우리반 학생들의 별명: " + Arrays.toString(student));

        while (true) {
            System.out.println("- 삭제할 학생의 별명을 입력하세요!");
            System.out.print("> ");
            String name = sc.next();

            //index찾기
            int index = -1;
            for (int i = 0; i < student.length ; i++) {
                if (name.equals(student[i])){
                    index = i;
                    break;
                }
            }//for end

            System.out.printf("%s는 %d번째 학생 입니다.\n", name, index);

            //바꾸기
            if(index != -1) {
                for (int i = index; i <student.length - 1 ; i++) {
                    student[i] = student[i + 1];
                }
                break;
            } else {
                System.out.printf("%s은 존재하지 않습니다!", name);
            }
        }//end while

        //pop하기
        String[] temp = new String[student.length - 1];
        for (int i = 0; i < temp.length ; i++) {
            temp[i] = student[i];
        }
        student = temp;
        temp = null;

        System.out.println("남은 학생들의 별명입니다!" + Arrays.toString(student));


    }//end main
}
