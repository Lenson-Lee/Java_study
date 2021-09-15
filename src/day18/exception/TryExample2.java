package day18.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryExample2 {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("정수1: ");
            int n1 = sc.nextInt();  //warning

            System.out.println("정수2: ");
            int n2 = sc.nextInt();  //warning

            int divResult = n1 / n2;    //warning
            System.out.println("divResult = " + divResult);

            sc.close();

            //if문으로도 피해갈 수 있지만, sc.nextInt같은건 if가 어려워서 try catch로 가는 방법이 낫다.
        } catch (InputMismatchException e) {
            //e.printStackTrace();//개발자를 위해 에러의 정보를 보여주는 역할
            System.out.println("정수로만 입력하세요");

        } catch (ArithmeticException e) {
            System.out.println("0으로 나누면 안됩니다.");

        } catch (Exception e) {
            e.printStackTrace();    //이걸 통해 오류명을 알 수 있고, catch()에 오류명을 넣으면 이 오류에 대한 반응을 만들 수 있다.

        }
    }
}
