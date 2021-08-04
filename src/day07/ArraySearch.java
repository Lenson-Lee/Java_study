package day07;

import java.util.Scanner;
public class ArraySearch {
    public static void main(String[] args) {

        //JS에서는 index of쓴다.

        //자바에서 배열은 []이 아닌 {}인거 잊지말기
        String[] foods = {"치킨", "피자", "삼겹살", "족발"};

        //순차 탐색 알고리즘
        Scanner sc = new Scanner(System.in);
        System.out.println("찾을 음식명: ");
        String target = sc.next();
        sc.close();

        //찾은 인덱스를 저장할 변수: 해당 인덱스가 없는 경우 [0]이랑 헷갈릴 수 있어 -1, JS에서도 없는 값은 -1 반환함.
        int idx = -1;
        //탐색하는 데이터의 유무를 저장할 변수 : 못찾을 가능성이 있으니 false를 초기값으로.

        boolean include = false;
        //fori
        for (int i = 0; i < foods.length; i++) {
            if (foods[i].equals(target)) {
                idx = i;
                include = true;
                break;
            }//if end
        }//for end
        System.out.println("탐색인덱스: " + idx);
        System.out.println("탐색 성공?: " + include);

    }
}
