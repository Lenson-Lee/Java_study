package day12.modi.cls.pac2;

//import day12.modi.cls.pac1.A;
import day12.modi.cls.pac1.B;

public class C {
    B b =new B(); //B " public

    //************
    //A a = new A(); //import A 문에도 빨간 줄이 있는걸 보인다. A: default이기 때문에 다른 패키지에서는 쓸 수 없다.
    //************

    C() {
        //a.f1 = 1;
        //A 클래스 자체가 잠겨있어서 메소드?필드?가 퍼블릭이어도 다가갈 수 없다.
    }

}
