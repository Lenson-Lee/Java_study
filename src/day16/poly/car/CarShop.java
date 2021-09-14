package day16.poly.car;

public class CarShop {

    public int sellCar(Car car) {

        //인스턴스 연산자 ==, !=, >=, <=.....

        //인스턴스 of 연산자 ==, !=, >=, <=.....
        //반드시 인스턴스 of 후 강제 형변환을 시행하여 오류를 방지해야한다.)
        if(car instanceof Sonata) {   //매개변수?가 소나타의 객체이면 참.
            return 1300;
        } else if (car instanceof Tucson) {
            return 1500;
        } else if (car instanceof Boxster) {
            return 7800;
        } else {
            return 0;
        }
    }

}
