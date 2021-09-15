package day18.exception;

class Test {
    int number;

    //생성자
    public Test(int number) throws Exception {
        this.number =
                aaa(number);
        //예외를 시ㅡ긴처에 추가(떠넘기기)
    }

    public int aaa(int n) throws Exception {
        return bbb(n) / n;  //3. bbb(2) / 2 = 12
        //예외를 시그니처에 추가
    }

    private int bbb(int n) throws Exception {
        return ccc(n) / n;  //2. ccc(2) / 2 = 25
        //예외를 시그니처에 추가
    }

    private int ccc(int n) throws ArithmeticException, NullPointerException { //ArithmeticException 으로 쓰면 0 주면 죽인다는 뜻
        return 100 / n; //1. ccc(2) = 50;
    }
}

public class ThrowsExample {

    public static void main(String[] args) {

        Test test = null;
        try {
            test = new Test(2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(test.number);

    }

}
