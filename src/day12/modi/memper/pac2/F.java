package day12.modi.memper.pac2;

import day12.modi.memper.pac1.D;

public class F {

    public F() {
        //메서드는 메서드와 생성자 안에서만 호출이 가능.
        // 쌩 클래스 안에서는 불가능.

        D d =new D();
        d.f1 = 1;//인스턴스
        //d.f2 = 2;//***default 제한
        //d.f3= 3;  ***private 제한

        d.m1();
//        d.m2();
//        d.m3();


    }
}
