package day15.final_;


//class Child extends Parent {
//    @Override   //배포목적으로 다른 사람들ㅇ한테 라ㅏ이브러리를
//    void m1() {}
//}

//public final class Parent : 상속 불가
public  class Parent {

    String s;

//    void m1() {}
//    void m2() {}

    //m1은 상속받고 2는 상속받기 싫을 때에는
    final void m1() {}//오버라이딩 불가
    void m2() {}


}


