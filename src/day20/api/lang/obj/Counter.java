package day20.api.lang.obj;

public class Counter {

    private int no;

    //생성자
    public Counter(int no) {
        this.no = no;
    }

    //소멸자   finalize 치면 자동, Object에서.
    //객체가 메모리에서 제거될 때 자동 호출. 언제 되는지는 아무도 모른다.
    @Override
    protected void finalize() throws Throwable {
        System.out.println(no + "번 객체 소멸됨!");

    }

    /*
        # C++ 소멸자 :     ~Counter() {}

        # 파이썬 생성자
        def __init__(self):
        파이썬의 self 가 자바의 this

        # 파이썬 소멸자
        def __del__(self):

     */

    public static void main(String[] args) {
        System.out.println("소멸자 테스트");
        Counter c = null;
        for (int i = 0; i < 50; i++) {
            c = new Counter(i);
            c = null;
            System.gc();//가비지 컬렉터를 빨리 호출하는것 (g 가비지 c 컬렉터 약자)
            //순서가 자기 멋대로 지워지는걸 확인이 가능하다. 자바의 고질적인 문제. 원하는 시점에 객체를 지울 수 없다.
        }

        String s = new String("ddd");    //원래 문법대로면 이렇게 써야하는데 문자열은 너무 많이 사용하다보니 자바에서 예외로 생략가능하게 해준거다.
        String s2 = "ddd";


    }


}
