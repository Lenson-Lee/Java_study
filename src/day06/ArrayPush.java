package day06;

import java.util.Arrays;

public class ArrayPush {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30};
        int newData = 40;

        //1. 원본 배열보다 사이즈가 1개 더 큰 임시 배열을 생성
        int[] temp = new int[arr.length + 1];

        //2. 기존 배열 데이터를 복사해서 신규배열로 이동
//        temp[i] = arr[i]; + ctrl + alt + T + 5하면 자동으로 for문에 들어감
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i]; //기존의 arr 갯수만큼 반복
        }

        //3. 추가할 데이터를 맨 마지막 위치에 저장
        temp[temp.length-1] = newData;

        //4. 주소값 이전
        //arr에 temp의 주소값을 복사해주고 temp를 비운다.
        arr = temp;
        temp = null;


        System.out.println("arr: " + Arrays.toString(arr));
        System.out.println("temp: " + Arrays.toString(temp));

    }
}
