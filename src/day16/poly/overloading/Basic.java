package day16.poly.overloading;

public class Basic {

    //오버로딩의 룰: 같은 형태를 또 만들면 안된다. 리턴값(타입)은 상관없음. 겹치면 겹치는 함수 두 개가 같이 오류가 난다.
    //오버라이딩은 자식부모클래스 오버로딩은 하나의 클래스내에서 같은 이름의 메서드 선언

    //add(int, int)
    int add(int n1, int n2) {
        System.out.println("두 개 짜리 실행");
        return n1 + n2;
    }
//그냥 add에서 두 개도, 세 개도 한번에 처리하면 안되나? => overloading
//    int addThree(int n1, int n2, int n3){
//        return n1 + n2 + n3;
//    }

    //add(int,int,int)
    int add(int n1, int n2, int n3) {
        System.out.println("세 개 짜리 실행");
        return n1 + n2 + n3;
    }
    //add(int,int와 중복되서 룰 위반. (int, String)이면 가능.
//    int add(int x, int y) {
//        return 0;
//    }
    //void여도 리턴타입이 달라도, (속의 형태만 다르면 된다.)
    void add(int m, String n) {

    }

    void add() {}
    public static void main(String[] args) {

        Basic basic = new Basic();
        basic.add(3, 5);
        basic.add(3, 5, 9);
        //basic.addThree(3, 5, 9);로 안써도 되니까 좋다. 오버로딩

        System.out.println();//이것또한 오버로딩. 함수도 들어가고 정수ㅜ, 스트링 다 가능능
        //System 클래스의 static out (의 print?)
    }
}

