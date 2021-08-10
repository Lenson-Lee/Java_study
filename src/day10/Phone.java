package day10;

//설계도 클래스는 main을 만들지 않습니다.
public class Phone {

    //속성: 객체의 데이터
    //필드(field) {JS는 프로퍼티라고 부른다}
    String model; //= " 갤럭시S9"; //모델명, 여기서 값을 지정해두면 앞으로도 값이 이거다. -> 일반적으로 필드 설계할 떄는 값을 구체적으로 초기화 하지 않음
    String color; //색상
    int price; //가격
    String[] receiveMessages; //받은 문자메시지들
    int messageCount; //총 메시지 수
    boolean isOn; //전원이 켜져있으면 True

    //기능: 객체의 행위
    //메서드(method) : static은 붙이지 마세요.


    //생성자(constructor)
    //객체를 생성하고 초기화를 담당 무조건 void형이다. -> 어차피 보이드니까 returntype없다.
    //       생성자가 값을초기화해서 설정안해도 된다.
//          장젘) 기본적인 내용을 빠르게 대량생산.
//          단점) 다른 폰 모델을 만들 수 없다.
    //void Phone() {}
    Phone() {
       model = "갤럭시 Z-Fold2";
       color = "펄 블루";
       price = 30000000;
       isOn = true;
    }
    //생성자는 여러 개 선언할 수 있음(오버로딩)
    Phone(String modelName) {
        model = modelName;
        color = "스노우 화이트";
        price = 120000;
        isOn = true;
    }
    Phone(String modelName, String colorName) {
        model = modelName;
        color = colorName;
        price = 140000;
        isOn = true;
    }

    //전원 켜는 기능
    void powerOn() {
        isOn = true;
        System.out.println(model + "의 전원을 켭니다.");
    }
    //전원 끄는 기능
    void powerOff() {
        isOn = false;
        System.out.println(model + "의 전원을 끕니다.");
    }
    //핸드폰의 정보를 보여주는 기능
    void showSpec() {
        if (!isOn) {
            System.out.println("전원을 먼저 켜세요~");
            return;
        }

        System.out.println("\n### 휴대폰 정보 ###");
        System.out.println("* 모델명:" + model);
        System.out.println("* 색상:" + color);
        System.out.println("* 가격:" + price + "원");
    }




}
