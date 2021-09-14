package day17.abs;
//abastract 추가
public abstract class Car {

    private String model;
    private int price;

    public Car(String model, int price) {
        this.model = model;
        this.price = price;
    }

    //주행기능 제작
//    public void start() {
//        System.out.println("자동차가 달립니다.");
//    }
    //추상 메서드
    //=>> 추상 메서드 구체적인 블록없이 실체가 없다 쓰려면 클래스도 abstract class 로 써야한다.
    //어떻게 보면 모든 자동차의 메서드들은 start()가 필수적이라는 뜻이 되기도 한다. => 안만들고 못 배김!!


    //밑의 셋의 차이를 알아야한다.
    //꼭 써야하고 일반클래스에서는 추상클래스를 못 쓴다!
    public abstract void start();

    //public abstract void break(); //break 는 뜻이 있어서 변수명 사용 못해 바버야~~!!engineBreak 로 쓰셈

    //안쓸거면 말고 바꿔써도 되고
    public void seatHeater() {
        System.out.println("시트 열선 기능을 가동합니다.");
    }

    //쓸거면 수정 못하고 써야한다
    public final void powerHandle(){
        System.out.println("파원핸들 기능!");
    }





}
