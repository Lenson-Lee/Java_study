package day06;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayPushQuiz {
    public static void main(String[] args) {

        //반복문은 한 번 반복할 때 무엇을 해야하는지 생각 하고 짜는게 편하다.

        //문자열끼리의 동등 비교 시 ==을 사용하지 말고 문자열1.eqals(문자열2) 를 사용할 것!
        //ex) if (s1==s2) (x)
        //    if (s1.equals(s2)) (o)
        //배열이 0개로 시작해야한다. -> new String[0]

        Scanner sc = new Scanner(System.in);
        System.out.println("먹고 싶은 음식을 입력하세요!");

        //음식이름들 저장할 배열
        String[] foodArr = {};
        //String[] foods = new String[0]; 도 가능
        
        while (true) {
            //음식 입력창
            System.out.print("> ");
            String food = sc.nextLine(); //띄어쓰기 받으려면 nextLine 써야 한다.
            
            //종료 조건
            if(food.equals("그만")) break;

            //임시배열 : 공간확보 -> 사이즈가 기존배열보다 1개 큰 배열.
            //입력할 때마다 +1 되야해서 반복문에 들어온다.
            String[] temp = new String[foodArr.length + 1];

            //기존의 음식들을 임시배열로 이동하기
            for (int i = 0; i < foodArr.length; i++) {
                temp[i] = foodArr[i];
            }
            //새로운 음식을 사이즈가 큰 임시배열의 마지막 인덱스에 추가
            //temp N번째에 food 넣기
            temp[temp.length - 1] = food;

            //원본배열로 임시배열의 주소를 이동, temp 비우기
            foodArr = temp;
            temp = null;
        }

        System.out.println("입력을 종료합니다. 먹고싶은 음식:" + Arrays.toString(foodArr));
    }
}
