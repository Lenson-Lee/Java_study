package day13.encap;

public class Main {
    public static void main(String[] args) {

        Car myCar = new Car();
//
//        myCar.startInjectionGasoline();
//        myCar.moveCylinder();
//        myCar.moveCylinder(); 함부러 쓰지 못하도록 은닉시키기 : private 처리

        myCar.accelerator();
        myCar.accelerator();
        myCar.accelerator();
        myCar.accelerator();

        //myCar.speed = 300;  //직접 접근해서 늘려버리면 변경되어버린다 => 은닉,private
        //근데 프라이빗 해버리면 밑에 속도를 확인하는 문장도 막혀버린다. => 값을 조회하는건 가능, 변경불가. getter
        //속도 밑에 getSpeed문장 제작한거 확인하기

        myCar.slowdown();
        myCar.slowdown();
        myCar.slowdown();
        myCar.slowdown();

        System.out.println("현재 속도: " + myCar.getSpeed());

        System.out.println("==================================");

//        myCar.mode = 'D';//사용자가 z, a 머 이런 첨보는거 넣을 수도 있으니 막는다.
//        myCar.showMode();

        myCar.setMode('Z');
        myCar.setMode('D');

    }
}
