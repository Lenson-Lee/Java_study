package day08;

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {

        int[] arrr= {10, 20, 30};

        //2차배열
        int[][] arr2d = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("arr2d.length = " + arr2d.length);
        System.out.println(Arrays.toString(arr2d[1]));
        System.out.println(arr2d[2][1]);
        arr2d[1][2] = 100;

//        arr2d[2] = 10;//[2]번은 int배열 {7,8,9,}여서 잚못된거다.
        arr2d[2] = new int[] {10, 20, 30};


        //2차원 배열의 반복문 처리
        System.out.println("================================");
        //2차
        for(int[] arr: arr2d) {
            //1차
            for (int n : arr) {
                System.out.print(n + " ");
            }
            System.out.println();//단순 줄개행

        }
        System.out.println("=============================");

        //배열 생성문으로 생성하기
        //3행 5열짜리 배열
        int[][] testArr = new int[3][5];
//        iter
        for (int[] ints : testArr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        //3차원 배열
        int[][][] arr3d ={
              {{1,2,3},
                {4,5,6},
                {7,8,9}
            },
            {   {10,12,13},
                {14,15,16},
                {17,18,19}
            },
            {
                {21,22,23},
                {24,25,26},
                {27,28,29}}
        };

        System.out.println(arr3d[2][0][1]);

        //2차원 2 개
        //한 명이 4과목 시험 점수 저장 -> 1차원
        //1학급 30명의 4괌고 점수 -> 2차원
        //1학년 3학급 30명의 4과목 점수 -> 3차원원
       int[][][] arr3dTest = new int[2][4][3];
        for (int[][] ints : arr3dTest) {
            for (int[] anInt : ints) {
                for (int i : anInt) {

                }
            }
        }



    }//end main
}
