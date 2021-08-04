package day07;

import java.util.Arrays;

public class ArrayDelete {
    public static void main(String[] args) {

        //배열의 중간데이터 삭제
        int[] arr = {1, 3, 5, 7, 9, 11};
        System.out.println("삭제 전: " + Arrays.toString(arr));

//5를 지우고 5의 자리에 7이 들어가게 하기, 7 옆에는 9가 와야하고..마지막 배열은 삭제(pop)해야함.

        //  i      i + 1
//        arr[2] = arr[3];
//        arr[3] = arr[4];
//        arr[4] = arr[5];

        //삭제 인덱스
        int delIdx = 3;
        //마지막 배열은 어차피 빠져야 하니 -1 했다.
        for (int i = delIdx; i < arr.length - 1; i++) {
            arr[i] = arr[i+1];
        }

        //pop 하는 코드
        int [] temp = new int[arr.length -1];
        for (int i = 0; i < temp.length ; i++) {
            temp[i] = arr[i];
        }
        arr = temp; temp = null;
        System.out.println("삭제 후: " + Arrays.toString(arr));
    }}
