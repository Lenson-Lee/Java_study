package day16.poly.car;

public class Driver {

//    public void driveSonata(Sonata s) {
//        System.out.println("운전을 시작합니다.");
//        s.run();
//    }
//    public void driveTucson(Tucson t){
//        System.out.println("운전을 시작합니다.");
//        t.run();
//    }         => 이런 식이면 언제 다 만들어서 넣냐고..

    public void drive(Tucson t) {
        System.out.println("운전을 시작합니다.");
        t.run();
    }
    //drive(new Sonata());  => Car c = new Sonata();
    public void drive(Car c) {
        System.out.println("운전을 시작합니다.");
        c.run();
    }       //이렇게 하면 Car 의 모든 자동차가 들어갈 수 있다. => 코드절약

    //int x = 100;  test(x); =>
    public void test(int a) {
        System.out.println("a =" + a);
    }



}
