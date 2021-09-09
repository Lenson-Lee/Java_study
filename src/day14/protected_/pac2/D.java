package day14.protected_.pac2;

import day14.protected_.pac1.A;

public class D extends A {


    public D() {
       // super(5); //부모생성자 물려오는데 디폴트값은 제한을 못건들인다.
        super("43243"); //프로텍티드?
       // super.f1 = 1;
        super.f2 = 3;

        //super.m1();
        super.m2();


        //프로텍트는 상속관계에 있으면 다른 패키지여도 접근할 수 있는데 디폴트는 다르다는 차이점이 있다. 실무에선 디폴트 거의 안쓰낟.ㅏ
        //프로텍트는 유연하게 가자는거다.
        //진짜 아무데서 다 써야 하면 퍼블릭,ㅇ ㅕ기서 나가면안되면 프라이베이트
    }
}
