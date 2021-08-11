package day10;

public class Battery {

    String company; //제조사
    int price; //가격
    int amount; //용량


    //Battery() {} 생성자를 만들지 않아도 기본 생성자가 보이지 않게 있다. 컴파일 해보면 알음
    //## 생성자가 하나도 없을ㄹ 때만 있다. 하나라도 만들어져 있으면 없음.

    Battery(String comp) {
        company = comp;
    }


}
