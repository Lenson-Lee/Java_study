package day17.abs;

public abstract class Santafe extends Car {
    public Santafe(String model, int price) {
        super(model, price);
    }

    @Override
    public abstract void start();

    @Override
    public void seatHeater() {
        System.out.println("산타페의 열선 기능을 가동합니다.");
    }
}
