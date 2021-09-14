package day16.poly.car;

import javax.swing.*;

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

    public Car buyCar(String carName) {

        //void 는 리턴값이 업는 함수여서  자동차타입으로 변환해줘야한다.

        if (carName.equals("투싼")){
            System.out.println("투싼을 구매합니다.");
            return new Tucson();
        } else if (carName.equals("소나타")) {
            System.out.println("소나타를 구매합니다.");
            return new Sonata();
        } else if (carName.equals("포르쉐")){
            System.out.println("박스터를 구매합니다.");
            return new Boxster();
        } else {
            System.out.println("그런 차량은 없습니다.");
            return null;
        }
    }


}
