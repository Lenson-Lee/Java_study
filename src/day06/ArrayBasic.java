package day06;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayBasic {
    public static void main(String[] args) {

        //1. 배열 변수 선언 => 타입[] 변수명;
        int[] points;
//        points[0] = 100;는 아직 안된다.
        //2. 배열 객체 생성 (객체를 넣을 방을 빌린다.) => new타입[수]
        points = new int[5];
        System.out.println("points = " + points); //points = [I@1b6d3586 [I는 Int형 배열이라는 뜻. 이후는 접근할 수 있는 주소값.

        //3. 배열값 초기화
        points[0] = 87;
        points[1] = 95;
        points[2] = points[0] + 4;//91
        points[3] = (int)33.154; //Double형이다~! (int)로 형변환을 하면 가능하지만 형태가 변해서 데이터의 손실은 감수해야 한다. .154가 사라짐
        points[4] = 100;
//        points[5] = 55; 배열 인덱스 범위 초과 (runtime exception) 주의해야함. Expection 오류.. 배열의 갯수를 초과해서 뜬다.

        //4. 배열의 길이 확인
        System.out.println("배열의 총 요소 수: "+ points.length);

        //5. 배열의 반복문 처리
        System.out.println("================================");
        for (int i=0; i < 5; i++) {
            System.out.print(points[i]+ " ");
        }

        System.out.println("\n===========향상된 for문=============");
        //enhanced for : 향상된 for문(for of 같은 반복문. of대신 :을 씀) => (type 새 변수명 : 배열변수명) {}
        for (int n : points) {
            System.out.print(n + " ");
        }
        System.out.println("\n================================");

        //points배열의 숫자 총합
        int total = 0;
        //단축키 iter => for of 바로나옴
        //for에 커서 두고 alt + enter
        for (int n : points) {
            total += n;
        }
        System.out.println("총합: " + total);

        //값 목록으로 배열 생성
        //배열의 선언과 생성을 동시에 할 수 있음
        double[] dArr = new double[4];

        //배열의 선언과 생성과 초기화를 동시에 할 수 있음 new String[]갯수를 (구체적으로) 적으면 안된다.
        //new String[]은 생성시에만 생략 가능, 수정시에는 핅수.
        String[] foods = new String[] {"짜장면", "탕수육", "볶음밥"};

        //배열의 선언시에만 new type[] 생략 가능
        String[] fruits = {"사과", "딸기", "바나나", "포도"};

        //배열 내부 값 문자열로 보기 Arrays 대문자 주의
        System.out.println(Arrays.toString(foods));
        System.out.println(Arrays.toString(fruits));

        System.out.println("==========================================");

        //배열을 생성만 하고 초기화하지 않은 경우 각 타입의 기본값 저장
//        boolean[] bArr = new boolean[5]; :false
//        double[] bArr = new double[5]; : 0.0
//        int[] bArr = new int[5]; : 0
//        String[] bArr = new String[5]; : null
        //기본값 때문에? 기본값이 나온다??
        boolean[] bArr = new boolean[5];
        System.out.println(Arrays.toString(bArr));

        //배열 복사
        System.out.println("================배열복사===================");
        //new int[]가 생략 가능하지만 원본 문법이라 알고있으라고 적어둠
        int[] iArr = new int[] {1, 3, 5, 7, 9, 11};
        //iArr의 값 복사가 아니라 iArr의 배열 주소값을 복사한 셈이라 수를 바꾸면 같이 바뀐다..
//
//        int[] copyArr = iArr;
//        System.out.println("iArr: " + Arrays.toString(iArr));
//        System.out.println("copyArr: " + Arrays.toString(copyArr));
//
//        //(X)! 복사가 아니라 같이 바뀌어 버린다!!
//        copyArr[2] = 1000;
//        System.out.println("iArr: " + Arrays.toString(iArr));
//        System.out.println("copyArr: " + Arrays.toString(copyArr));

        System.out.println("=============배열복사============");
        // (O)이렇게 해야 한다!!
        //배열의 복사 알고리즘
        //1. 원본배열과 크기가 같은 배열 하나를 더 생성함.
        int[] copyArr = new int[iArr.length];

        //2. 원본배열의 값들을 복사배열로 값 복사사
       for (int i=0; i <copyArr.length; i++) {
            copyArr[i] = iArr[i];
        }
        copyArr[2] = 100;

        System.out.println("iArr: " + Arrays.toString(iArr));
        System.out.println("copyArr: " + Arrays.toString(copyArr));


    }
}
