package day14.inherit.player;

//공통 기능과 속성을 가진 클래스를 부모, 상위 클래스(super class)라고 부른다.
public class Player extends Object {


    //extends Object 는 기본적으로 상속. 생략? ctrl 로 들어가보면 단축키에 뜨던 태그들이 뜬다.
    //죽음의 다이아몬드: 상속은 하나만 받을 수 있다. DDD 구글링 해보면 알 듯 다중상속의 위험..

    //자식 클래스명에 extends Player 입력.
    //공통 속성
    String nickName;
    int level;
    int hp;

    //기본생성자
    public Player() {
        System.out.println("부모 객체 클래스 Player 생성!");

    }


    //공통 기능
    public void info() {
        System.out.println("\n=========== 캐릭터 정보(수정) ==========");
        System.out.println("# 닉네임: " + nickName);
        System.out.println("# : 레벨" + level);
        System.out.println("# : 체력" + hp);
    }



}
