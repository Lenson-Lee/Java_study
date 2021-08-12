package day12.modi.cls.pac1;
//class는 예약어라 cls라고 적었다.

import day12.modi.cls.pac2.C;

class A {
      //default 접근제한자는 접근제한자 자리에 아무것도 안쓰면 된다.
    //클래스에는 public, default제한만 사용이 가능하다.

    public int f1;
    public int f2; //아무리 메소드를 퍼블릭으로 풀어놓은들 클래스 입장에서 디폴트여서 C클래스 입장에서는 결국엔 못쓴다.



    void m1() {
        B b = new B();
        //A와 B가 같은 패키지에 있어서 부를 수 있다.;
        //B가 퍼블릭이도 하다.

//        new C + alt enter
//        public C c = new C();
        //다른 패키지에 있는 애는 소속을 밝히고 써야한다 ->import


    }

}
