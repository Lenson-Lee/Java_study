package day17.abs;

public class Ferrari extends Car{
//주행기능이 없어서 Car를 상속받을 수없다.
    public Ferrari(String model, int price) {
        super(model, price);
    }

    //public void run() {을 start() 로 바꿔야함
    public void start() {
        System.out.println("페라리가 달립니다.");
    }

}
