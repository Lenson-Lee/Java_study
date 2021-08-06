package day09;
/*
    1. 자바 메서드는 클래스 내부, 메서드 외부에 선언한다. -> main method는 메소드여서 안된다.
    2. 메서드는 메서드 안에서만 호출할 수 있다.(재귀함수)

 */


public class MethodBasic {

    //1 ~ x까지의 총합을 구해서 리턴하는 함수 정의(JS버전)
    // 시작 맨 앞에는 리턴되는 값의 타입을 입력한다. total => int
    static int calcTotal(int x) { //int x는 매개변수. parameter.
        System.out.println("calcTotal 호출됨");
        int total = 0;
        for ( int n = 1; n <= x; n++) {
            total += n;
        }
        return total;
    }



    //얘도 알고보면 메인함수
    public static void main(String[] args) {

//        //1 ~ 10까지 총합
//        int total;
//
//        total = 0;
//        for (int n = 1; n < 11; n++) {
//            total +=n;
//        }
//        //적진 않았지만 여기엔 코드 100만줄이 더 있따~~~
//        //1 ~ 50까지의 총합, 1 ~ 100까지의 총합 등 비슷한 구조가 반복될 떄
//        total = 0;
//        for (int n = 1; n < 51; n++) {
//            total += n;
//        }

    //메서드 호출
        int result = calcTotal(10);//인수 혹은 인자, argument
        System.out.println("result = " + result);
        int result2 = calcTotal(50);
        System.out.println("result2 = " + result2);
    }//end main method




}//end class
