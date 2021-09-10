package day15.static_;

public class Count {

    //static_ 폴더명은 기존 기능의 이름에 스태틱이 있어서 차이를 주기위해 언더바 올림
    public int x; //인스턴스 필드(지금까지 써왔던 필드)
    public static int y; //정적 필드(스태틱필드)

    //x는 클래스에 카운트객체 하나 나올때마다 개별적으로 x 하나씩만들지만(메모리 n배) y는 y 하나를 여러 클래스에 고정적으로 사용.(메모리 1개)
    //y를 한 클래스에서 수정하면 다른 클래스에서의 y값도 변경된다. => 스태틱의 새로운 객체이름을 밝히지 않고? 기존의 이름만 쓰낟? main 클래스 참조
    //Math.random()도 확인해보면 static 이다. 그래서 new Math 사용하지 않았던 거다.

    //인스턴스메서드
    public void m1() {
        int z = this.x + this.y;    //m1을 호출하는 녀석의 x
        //m2(c:this);
    }
    //스테틱메서드
    public static void m2(Count c) {   //void 는 그렇게 안쓴다.
        //스태틱 메서드에서는 인스턴스 멤버를 직접 사용하는게 불가능하다.
        // this 라는 개념이 없다.
        //int z = x + y;  //y는 어차피 스태틱이라 메모리 한 개라 찾을 수 있지만 x는 카운트 갯수가 여러개면 어디의 x인지 몰라서 오류가 난다.
        //스태틱4 안에서 직접 쓸 수 있는건 스태틱 뿐. 나머지는 aa.bb() 식으로 . 을 찍어야 한다.

        int z = c.x + y;



    }


}
