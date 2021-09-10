package day15.final_;

public class Korean {

    String name; //이름
    static final String NATION; //국적은 코리안이어서 애초에 한국인으로 고정값.
    final String sid;

    public Korean(String name,String nation,  String sid) {
        this.name = name;
        this.sid = sid;
    }

    static {
        NATION = "대한민국";
    }
    //상수는 불변해야 하며 공유되어야 한다.
    public static void main(String[] args) {
        //Korean park = new Korean();
        //park.nation = "미국";//코리안인데 국적이 바뀌면 안되서 final 로 막는다.

        //파이널이지만 국적을 바꿀 수 있다.
        Korean park = new Korean("박영희", "미국", "9977-11112");
        park.name = "박찬호";
        //park.nation = "대한민국";

        Korean kim = new Korean("김철수", "중국", "6677-123456");
        //상수는 어떤 객체가 접근해도 똑같은 값이어야 하고, 변경이 불가능해야 하다.
        //파이널은 공유가 안된다.
        //static final 로 상수작성.
        //처음 지정한것만 못바꾸게 하겠다 : final
    }

}
