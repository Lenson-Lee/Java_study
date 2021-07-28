package day02;

public class LogicalCasting {

    public static void main(String[] args) {
        int x = 10, y = 20;
        boolean result1 = (x!= 10) & (++y == 21);//!= ! =   &&, || 두 개짜리는 성질이 급해서 앞서 false가 뜨거나 true가 뜨면 그 이후의 값은 실행 안한다.
        boolean result2 = (x == 10) | (++y == 21); // 논리 참거짓을 떠나서 실행안하고 제끼면 안되는 중요한 구문일 때는 하나만 적는다.

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("x = " + x);
        System.out.println("y = " + y);


    }
}
