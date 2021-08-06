package day09;

public class MethodReturn {
    //리턴값이 없는 메서드 : 메서드가 코드만 실행하고 호출부로 값을 전달하지 않는 경우
    //void = return할 값이 없다!
    static void showMultiply(int n1, int n2) {
        System.out.printf("%d x %d = %d\n", n1, n2, n1 * n2);
    }

    static int add(int n1, int n2) {
        return n1 + n2;
//        System.out.println("hello");//함수는 리턴을 만나면 즉시 종료되어서 오류가 뜬다.
    }

    static void sayHello(String name) {
        if (name.length() > 5) {
            System.out.println("이름이 너무 길어~꺼져~");
            return;
        }
        System.out.println(name + "님 하이~");
    }

    //모든 메서드의 리턴값은 오직 한 개
    //두 개의 정수를 전달받아 덧셈, 뺼셈, 곱셈, 나눗셈의 결과를 리턴
    static int[] operateAll(int n1, int n2) {
        return new int[]{n1 + n2, n1 - n2, n1 * n2, n1 / n2};
//        int plus = n1 + n2;
//        int minus = n1 - n2;
//        int multi = n1 * n2;
//        int divide = n1 / n2;
        //return plus, minus, multi, divide;//네 개를 배열로 묶어서 주소값을 한 개로 보내주기?
    }



    public static void main(String[] args) {
        //return값이 없는 void타입 메서드는 단독호출해서 사용
        showMultiply(add(5,5), add(3,3));
        showMultiply(5,5);
        int result = add(1,2);

//      add(showMultiply(3,3), showMultiply(5,5)); //show함수는 값을 호출 안해서 안됨.

        System.out.println("==================================");
        sayHello("홍길동");
        sayHello("king god emperor general master park");
        System.out.println("==================================");

//        operateAll(10, 5)//ctrl + alt + v
        int[] operList = operateAll(5, 10);
        System.out.println("덧셈결과" + operList[0]);
        System.out.println("뺼셈결과" + operList[1]);
        System.out.println("곱셈결과" + operList[2]);
        System.out.println("나눗셈결과" + operList[3]);
    }
}

