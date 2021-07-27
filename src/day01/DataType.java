package day01;

public class DataType {

    public static void main(String[] args) {


        //정수형
//        byte a = 128;
        byte a = 127;
//        short b = 32768;
        short b = 32767;
//        int c = 2147483648;
        int c = 2147483647;
//        long 에러는 다르다. 숫자가 커서가 아니라 int값을 넘어섰기 때문. 리터럴은 int만 가능해서 오류난다.L 붙이기. 2147483648L까지 가능. 소문자 l도 되지만 잘보이게 대문자로 작성.
        long d = 2147483648L;


        //실수형
        float f1 = 3.84848484848F; //4byte 에러나니까 F 붙이기
        double d1 = 3.8484848484848484848; //8byte

        System.out.println("f1 = " + f1);
        System.out.println("d1 = " + d1);

        double n = 0.0;
        //fori
        for (int i = 0; i < 100; i++) {
            n += 0.1;
        }
        System.out.println("0.1을 100번 더한 결과:" + n);

        //논리형
        boolean b1 = true;
        boolean b2 = false;

        //자바의 논리형은 JS처럼 falsy값이 존재하지 않음.
//        boolean b3 = 0; (X)
//        boolean b4 = null; (X)
//        boolean b5 = "true"; (X)
//        boolean b6 = False; (X)대소문자!
//        while (1) { (X)


        //문자형
        //char: 단일문자를 저장, 홑따옴표 사용
        char c1 = 'A'; //쌍따옴표 사용 안됨. 두글자 이상 입력 안됨.
//        char c2 = "a", char c3 = 'abc'

        //String: 문자열을 저장, 겹따옴표 사용, 기본타입 아님
        //테스트 주석
        String s1 = "abcdef";

        System.out.println("100" + "200"); //300(X) 100200(O)
        //숫자와 문자열의 덧셈은 문자열 덧셈처리
        System.out.println(100 + "200");

//        System.out.println("200" - 100); (X)



    }
}
