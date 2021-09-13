package day16.poly.car;

public class Car {

    Tire frontLeft = new NexenTire();  //Tire 에도 상속이 된다.
    Tire frontRight;
    Tire rearLeft;
    Tire rearRight;

    //타이어 교체 기능
    public void changeTire() {

        this.frontLeft = new NexenTire();
        this.frontRight = new NexenTire();
        this.rearLeft = new KumhoTire();
        this.rearRight = new KumhoTire();
        System.out.println("타이어 교체 완료!");
    }

    //주행 기능
    public void run() {
        System.out.println("자동차가 달립니다.");
    }
}
