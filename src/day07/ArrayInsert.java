package day07;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = {"마라탕", "파스타", "돼지국밥", "샐러드"};
        System.out.println("* 추가 전 목록: " + Arrays.toString(arr));

        System.out.println("* 추가할 메뉴를 입력해 주세요.");
        System.out.println("* 그만 추가하고 싶을 때는 0을 입력해 주세요.");
        System.out.print("> ");

        //임시배열, 추가해야하니 배열 공간을 +1 해준다
        String[] temp = new String[arr.length + 1];



            for (int i = 0; i < arr.length; i++) {
                temp[i] = arr[i];
            }
            temp[arr.length] = sc.next();


        System.out.println("음식메뉴" + Arrays.toString(temp));

//        arr = temp;
//        temp = null;
//
//        System.out.println(Arrays.toString(arr));



    }//end main
}
