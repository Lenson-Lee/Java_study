package day02;

public class Casting02 {

    public static void main(String[] args) {

        char c = 'B';
        int i = 2;
        System.out.println(c + i);
        //char와 int의 경우 낮은애를 높은쪽으로.
        System.out.println(10 + 3.5);//int + double => double + double, int가 더블로 바뀐다.
        
        
//        char result = c + i; //필요타입이 char - c+i int인데 무슨..
        char result = (char) (c + i); //필요타입이 char - c+i int인데 무슨..
        System.out.println("result = " + result);
        
        double result2 = 3.5F + 5.6;
        //크기가 다른 데이터끼리의 연산은 크기가 작은쪽이 큰쪽으로 자동형변환 된 후 연산됨.
        
        //int보다 작은(byte,short,char)의 연산은 결과값이 자동으로 int로 형 변환된다.
        byte b1 = 100, b2 = 110;
        int b3 = b1 + b2; //int값이 나온다.
        
        //byte합이 220이어서 안되는게 아님.... 
        
        int n1 = 27, n2 = 5;
        double result3 = (double) n1 / n2; //  = 5 n2도 더블로 자동변환된다.

        System.out.println("result3 = " + result3);

        //ㅑㅜㅅ + ㅑㅜ = ㅑㅜㅅ
        // byte + byte = int
        //short + hort     =nyte

//        Public class PlusMinusOperator {
//            public static void main(String[] args) {
//
//                int x = 3;
//                int y = ++x + 5 * 3;
//                int z = 5 * y-- + x++ - --y;
//                System.out.println("x = " + x);
//                System.out.println("y = " + y);
//                System.out.println("z = " + z);
//            }
//        }

        
    }
}
