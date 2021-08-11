package day10;
//실행용 클래스( 객체를 생성해서 사용하는 곳)에 메인을 만든다.
public class PhoneFactory {


    public static void main(String[] args) {
        //객체의 생성
        Phone galaxyS21 = new Phone();
        //new Phone(); 2개 이상으로 쓰면 여러개 만드ㅏ는거.
        System.out.println("galaxyS21 = " + galaxyS21); //폰타입의 주소가 나타남

        //객체의 속성과 기능 참조: 참조연산자 . 을 사용.(~를 통해, ~의 라는 뜻)
        //ctrl 누르고 함수들 누르면 위치 이동함.
//        galaxyS21.model = "갤럭시S21";
//        galaxyS21.color = "크롬블랙";
//        galaxyS21.price = 100000;
//\       생성자가 값을초기화해서 설정안해도 된다.
//          장젘) 기본적인 내용을 빠르게 대량생산.
//          단점) 다른 폰 모델을 만들 수 없다.


//        Phone iPhoneX = new Phone();
//        iPhoneX.model = "아이폰X";
//        iPhoneX.showSpec();
//
//        galaxyS21.powerOn();
//        galaxyS21.showSpec();
        //showSpec은 단독호출이 불가하다. 아무때나 쓸 수 있는게 아니라 우리가 설정한 phone만 사용가능한 함수다.
        int a = 10;
        //a.showSpec(); (x)


        System.out.println("=================================");


        Phone iPhoneX = new Phone("아이폰X");
        iPhoneX.showSpec();

        System.out.println("==================================");

        Phone lgV6 = new Phone("LG V6", "다라이레드");
        lgV6.showSpec();


        System.out.println("===================================");

        //System.out.println("아이폰x 배터리: "+ iPhoneX.battery);  //null. 아직 없다.
        //iPhoneX.battery = new Battery();//기본 생성자.

        //Phone 타입 iPhonex에 Battery타입의 battery를 부르고, battery 속의 company를 부른거다..
        iPhoneX.battery = new Battery("샤오미");
        System.out.println("아이폰x 배터리: "+ iPhoneX.battery.company);


        System.out.println("===================================");

        //sendMessage()에서 ctrl+T하면 단축
        //iPhoneX.powerOff();
        galaxyS21.sendMessage(iPhoneX, "에벱벱");
        galaxyS21.sendMessage(iPhoneX, "에벱벱");
        galaxyS21.sendMessage(lgV6, "멍멍야옹");
        lgV6.sendMessage(iPhoneX, "야옹이와멍멍이");

        iPhoneX.checkMessages();
        lgV6.checkMessages();






//        iPhoneX.model = "아이폰X";
//        //iPhoneX.company => 필드에 없는 속성은 만들 수 없다. 원하면 필드에 가서 만들어야함.자바스크립트는 가능하지만 자바는 불가.
//        iPhoneX.price = 200000;
//
//        iPhoneX.powerOn();
//        iPhoneX.showSpec();
//        galaxyS21.showSpec();





    }//main end
}
