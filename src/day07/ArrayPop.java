package day07;

import java.util.Arrays;

public class ArrayPop {
    public static void main(String[] args) {

        //배열의 끝데이터 삭제
        int[] arr = {10, 20, 30, 40};

        //사이즈가 하나 작은 배열을 생성
        int[] temp = new int[arr.length -1];

        //맨 마지막 데이터를 제외한 나머지를 temp로 복사
//        temp[0] = arr[0];
//        temp[1] = arr[1];
//        temp[2] = arr[2];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i];
        }

        //주소값 이전
        arr = temp;
        temp = null;
        System.out.println(Arrays.toString(arr));
    }// end main
}
