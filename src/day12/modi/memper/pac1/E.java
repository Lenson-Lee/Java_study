package day12.modi.memper.pac1;

public class E {

    public E() {
        D d = new D();

        d.f1 = 1; //public
        d.f2 = 2; //default
        //d.f3 = 3; //***private: 문제발생~ 프라이빗 제한은 같은 패키지 소속이어도 다른 클래스에서는 안된다.

        d.m1(); //public
        d.m2(); //default
        //d.m3(); //private



    }

}
