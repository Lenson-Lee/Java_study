package day10;

//설계도 클래스는 main을 만들지 않습니다.
public class Phone {

    //속성: 객체의 데이터
    //필드(field) {JS는 프로퍼티라고 부른다}


    //고유 데이터
    String model; //= " 갤럭시S9"; //모델명, 여기서 값을 지정해두면 앞으로도 값이 이거다. -> 일반적으로 필드 설계할 떄는 값을 구체적으로 초기화 하지 않음
    String color; //색상
    int price; //가격
    int a = 10;

    //상태데이터
    String[] receiveMessages = new String[3]; //받은 문자메시지들
    int messageCount; //총 메시지 수
    boolean isOn; //전원이 켜져있으면 True

    //부품 데이터(집합관계: composition)
    Battery battery;

    //기능: 객체의 행위
    //메서드(method) : static은 붙이지 마세요.


    //생성자(constructor)
    //객체를 생성하고 초기화를 담당 무조건 void형이다. -> 어차피 보이드니까 returntype없다.
    //       생성자가 값을초기화해서 설정안해도 된다.
//          장젘) 기본적인 내용을 빠르게 대량생산.
//          단점) 다른 폰 모델을 만들 수 없다.
    //void Phone() {}

    //Phone() => 아무것도 안 들어있으면 기본생성자(default constructor)
    Phone() {
       model = "갤럭시 Z-Fold2";
       color = "펄 블루";
       price = 30000000;
       isOn = true;
    }


    //생성자는 여러 개 선언할 수 있음(오버로딩)
    //오버로딩 규칙: 매개변수의 타입/개수/순서가 달라야 한다.
    //Phone(String)이 존재하면 하단 불가능. Phone(String,String)은 String이 두 개여서 가능...(modelName, colorName)
    //(int a, String b) ! = (String a, int b)
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
        int a = 10; //메소드 블럭 안에 있는 지역변수이다. 자바는 전역변수 개념이 없지만 클래스 밖의 변수는 아에 못쓴다. 위에 a는 클래스블록 안에 직속 되어 있는 필드.
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

    //문자 메시지를 보내는 기능
    boolean sendMessage(Phone targetPhone, String message) {
        if (!isOn) {//내 폰 전원이 꺼져 있으면
            System.out.printf("당신의 %s의 전원을 먼저 켜세요! \n", model);
            return false;
        } else if (!targetPhone.isOn) {//문자 받는 상대방 폰이 꺼져 있으면..
            System.out.printf("상대방 %s의 전원이 꺼져 있습니다.\n", targetPhone.model);
            return false;
        }

        //메시지를 보낼 수 있는 경우
        if (targetPhone.messageCount < targetPhone.receiveMessages.length) {
            targetPhone.receiveMessages[targetPhone.messageCount++] = message; //메시지를 일단 넣고 카운트를 1 올리기
            System.out.println("메시지가 성공적으로 전송됨.");
            return true;
        } else { //상대방 메시지함이 다 찬 경우
            System.out.println("상대방의 메시지함이 가득 찼습니다.");
            return false;
        }
    }

    //수신 메시지함을 확인하는 기능
    void checkMessages() {
        System.out.printf("\n=========== [%s]의 메시지함 =========\n", model);
        for (int i = 0; i < messageCount; i++) {
            System.out.printf("# %d. %s\n", i + 1, receiveMessages[i]);
        }
    }


    //배터리 교환기능
    void changeBattery() {
        battery = new Battery("삼성");
    }
}