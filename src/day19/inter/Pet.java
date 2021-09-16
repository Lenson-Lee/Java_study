package day19.inter;

public interface Pet {

    //추상 메서드 : Pet을 상속받는 모두에게 void Play() 사용 가ㅡㄴㅇ
    // {}로 블럭을 만들면 구체적으로 무엇을 하겠다 해서 추상메서드가 아니다
    // .//인터페이스는 디폴트가 추상메서드여서  public abstract적지않는다.
    //public abstract void play();

    //int a; => 상수만 가능해서 불가

    //기능적 측면에서 공통되는 것을 입력.
    //정적메서드 static void @@()는 가능
    //인터페이스의 가장 큰 단점:
    static final int AAA = 10;  //여기에 필드선언하면 다 상수라서 static final 도 없애도 된다

    void play();

    default void eat() {
        //디폴트 메서드: 자바 라이브러리에서 자주 이용된다.
        //시간날때마다 클래스 가서 오버라이딩으로 쓰고 이후에 여기서 추상메서드로 바꾸어 준다.
    }



}
