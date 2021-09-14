package day16.poly.casting;

public class Main {

    public static void main(String[] args) {

        Parent parent = new Parent();
        parent.m1();
        parent.m2(); //객체가 부모객체 new Parent()여서 오버라이딩된 자식이 아닌 부모 본인의 것 사용!
        //parent.m3(); 부모는 자식의 객체 참조 불가능.


        System.out.println("=========================================");
        Child child = new Child();
        child.m1();
        child.m2(); //객체가 new Child()여서 자식 메서드가 나온다!
        child.m3();

        System.out.println("==========================================");

        Parent c = new Child();
        System.out.println(c);  //c 의 주소
        c.m2();
        ((Child)c).m3();//잠깐만, 나 사실 자식이야..잠깐만... 나 부모 아니고 자식으로 돌아갈래.... c로 일시적으로 다운캐스팅 후 다시 원래대로 돌아온다.

        c.m2();


    }
}
