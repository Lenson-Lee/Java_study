package day12.modi.memper.pac1;

public class D {

    public int f1;
    int f2; //아무것도 안적힘: default
    private int f3;

    //사실 얘네도 앞에 아무것도 안적혀있는 디폴트 값이없다고 한다.

    public void m1(){}
    void m2(){}
    private void m3(){}

    //alt + insert키 -> 생성자 만들기
    public D() { //private: E클래스 오류, devault: F클래스 오류, 생성자에 접근제한 붙이기 가능하다는 거~~

        f1 = 1; f2 = 2; f3 = 3;
        m1(); m2(); m3();

    }
}
