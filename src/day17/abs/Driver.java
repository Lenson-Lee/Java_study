package day17.abs;

public class Driver {

    Car myCar;

    public Driver(Car myCar) {
        this.myCar = myCar;
    }

    public void drive() {
        myCar.start();
    }
}
