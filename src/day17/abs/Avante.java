package day17.abs;

//에러나는 이유: 디폴트 생성자가 없다. (현재 디스폴트상태)
//public class Avante extends Car{
public class Avante extends Car{

//    public Avante(){ 클래스가 비면 이런 기본 요소가 숨어있는데 여기서는 잘 보면
//        super();// = Car의 기본생성자 (Car에 가보면 기본생성자가 없는것을 볼 수 있다. => super와 일치하는 생성자 생성하면 된다./ 하단의 글이 결과.
//    }

    public Avante(String model, int price) {
        super(model, price);
    }

    @Override
    public void start() {
        System.out.println("아반뗴가 달립니다.");
    }


}
