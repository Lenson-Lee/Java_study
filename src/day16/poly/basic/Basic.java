package day16.poly.basic;
//A는 모두의 부모, 형제 B와 C B >D C->E
class A {}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}

public class Basic {
    //object 는 자바에서 꼭대기 클래스 모든 클래스의 부모.상속관계라는 뜻
    A x1 = new A();
    B x2 = new B();

    //모든 자식 객체는 부모타입으로 변환 가능
    A x3 = new B();
    A x4 = new C();

    B x5 = new D();
    A x55 = new D();
    A x6 = x5;

    Object x7 = new E();

    //상속관계가 없으면 타입변환 불가능 (형제관계)
    //C x8 = new B();
    //D x9 = new E();




}
