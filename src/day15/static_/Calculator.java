package day15.static_;

public class Calculator {

    String madeBy; //제조사
    String color; //색상
    static double pi; //원주율

    //정적 초기화(static initializer)
    //static 필드의 생성자(객체 초기화) 역할
    //Calculator.(aa) 하면 잗옹 호출
    static {
        System.out.println("정적 초기화자 호출!");
        pi = 3.1459265;
    }


    /*

    메서드 안에서 인스턴스 필드를 사용해야 하면
    non-static 으로 만들고, static 필드만 사용하면 static 으로 만들면 된다.

     */

    //계산기에 색칠하는 기능
    void paint(String color) {
        this.color = color;
        pi = 3.1459;
    }



    //원의 넓이를 구하는 기능
    //계속 똑같은 값을써서....? //일반 여러번 써두 되긴 하\지만 스테틱사용금지
    static double calcAreCircle(int r) {
        return pi * r * r;

    }


}
