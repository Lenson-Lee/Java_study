package day16.poly.car;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

//        Tucson t = new Tucson();
//        Sonata s = new Sonata();
//        Boxster b = new Boxster();

        //배열이 어차피 Car 형태(최 상위 부모)여서 투싼형도, 소나타 형도 Car 로 자동 형변환 되니까 가능
        //double 형에 int 형이 들어가도 되는것과 같은 원리
        Tucson t = new Tucson();
        Sonata s = new Sonata();
        Car b = new Boxster();

        //int[] arr = {1, 3, 1.5가 안되듯이};
        //Sonata[] sArr = {s, t, b, new Sonata(), new Tucson()};도 안된다. 그래서 Car로 사용
        Car [] sArr = {s, t, b, new Sonata(), new Tucson()};

        for (Car car : sArr) {
            car.run();
        }
//        Rich richMan = new Rich();
//        richMan.myCars = new Tucson[30];
//        richMan.myCars[0] = t;

        System.out.println("====================");

        Driver park = new Driver();
        //park.driveSonata(new Sonata());
        //park.driveTucson(new Tucson());
        park.drive(new Tucson());
        park.drive(new Boxster());

        System.out.println("====================");

        Sonata mySonata = (Sonata) park.buyCar("소나타");
        mySonata.run();

        //mySonata.joinClub();  타입이 mySonata는 Car타입이라 mySonata에 들어있는 객체는 sonata타입이라..?
        //리턴받는 순간 하위타입으로 변환하여 쓰면 된다. => Car mySonata를 Sonata my Sonata로 바꾼다. 40번줄
        mySonata.joinClub();

        sArr[0] = mySonata;

        System.out.println("====================");

        CarShop shop = new CarShop();
        int money = shop.sellCar(mySonata);
        int money2 = shop.sellCar(b);
        System.out.println("money = "+ money);
        System.out.println("money2 = "+ money2);


    }


}
