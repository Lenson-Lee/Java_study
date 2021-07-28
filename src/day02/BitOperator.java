package day02;

public class BitOperator {

    public static void main(String[] args) {

        //비트연산
        byte a = 5; //00000101
        byte b = 3; //00000011

        //비트곱: 각 자리수를 곱하세요
        System.out.println(a & b); //양 옆에 비트면 비트, 논리면 논리,// 000000001 => 1
        //비트합 : 각 자리수를 더하세요. 단 1+1은 1로 처리.
        System.out.println(a | b); // 00000111 =>7
        //배타적논리합: 다르면 1 같으면 0;
        System.out.println(a ^ b); //00000110 => 6


        //비트 이동 연산
        int x = 192; //00000000 00000000 00000000 11000000
        System.out.println(x << 3); //숫자 왼쪽으로 이동 (자릿수 올리기) 192 x 8
        System.out.println(x >> 3); //숫자 오른쪽으로 이동 (자릿수 내리기) 192 x 2의 -2승( = 192 / 4)

        //비트 반전 (단항 연산자)
        int y = 8; // 0000 1000
        System.out.println(~y); //1111 0111로 뒤집기





    }
}
