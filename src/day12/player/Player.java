package day12.player;

public class Player {

    String name;//필드.
    int level;
    int hp;

//    Player (String name) {
//        this.name = name;
//        //전달받은 네임을 나의 네임에 받겠다.
//        //피 네임은 지역변수라 날아가니까 네임에 만들어야하낟.
//    }


    public Player() {
        this("이름없음", 1);    //this(): 나의 다른 생성자를 불러오겠다
        System.out.println("1번 생성자 호출~");
//        this.name = "이름없음";
//        this.level = 1;
//        this.hp = 50;
    }

    //alt + insert
    public Player(String name) {
        //중복되는 코드들이 반복되니까 줄여서 써볼거다.
        //Player(name, 1); (X)
        this(name, 1); //(O) ## 맨 위에 써야함!!!!
        System.out.println("2번 생성자 호출!");
        /*this.name = name;
        this.level = 1;
        this.hp = 50;*/

    }

    public Player(String name, int level) {
        System.out.println("3번 생성자 호출!");
        this.name = name;
        this.level = level;
        this.hp = 50;
    }

    void attack(Player this, Player target){
    //this는 숨어있는 매개변수로, 안써도 된다.
    //메서드 호출의 주체. 본인.

//        System.out.println("target의 주소: " + target);
//        System.out.println("this의 주소: " + this);

        System.out.printf("%s가 %s를 공격합니다.\n", this.name, target.name);
    }

    void info() {
        System.out.printf("이름: %s, 레벨: %d, 체력: %d\n", this.name, this.level, this.hp);
    }
}
