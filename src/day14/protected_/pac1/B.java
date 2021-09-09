package day14.protected_.pac1;

public class B {

    public B() {
        new A(5);   //정수를 넣은건 디폴트 제한이 걸린걸 콜한거다. 프로텍트 콜 아님!
        A a = new A("ggg");   //스트링을 넘기면 프로텍트가 걸린 생성자 호출?

        a.f1 = 1;
        a.f2 = 2;
        a.m1(); a.m2();

    }
}
