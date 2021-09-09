package day14.inherit.player;

//상위클래스로부터 상속받은 클래스를 자식, 하위클래스(sub class)
public class Warrior extends Player {

    int rage;

    //alt insert => Warrior, ctrl a 하나씩 만들기. 두 개 만들고 setter,getter 만드는거 기본중의 기본이다.
    public Warrior() {
        super();//부모의 생성자 불러오기 ()가 비어있어서 기본 생성자 불러온다.   //기본값으로 임력없으면 숨어있는거다.
        //생략되어있다는건 필수라는 뜻이다.
        System.out.println("전사 객체 생셩!");
    }

    public Warrior(String nickName, int level, int hp, int rage) {
        this.nickName = nickName;
        this.level = level;
        this.hp = hp;
        this.rage = rage;
    }

    @Override   //메서드 이름을 바꾸면 오류가 난다. 부모님의 이름 그대로 물려받아야한다.
    //@오버라이드는 상속을 제대로 하고있는지 알려준다. 오류가 생기면 문제가 있는것.
    //more public. 부모보다 public 하게 써야한다. private 안된다는 뜻
    //겉 껍데기는 그대로두고, 고칠 것만 고쳐야 한다.
    //부모가 매개변수가 없으면 여기서도 매개변수가 업서양 한다. 매개변수 넣는 순간 오버라이드가 아닌 그냥 메서드로 된다.
    public void info() {
        super.info(); //내가 부모님의 info 를 그대로 부르겠다면 player의 인포가 불려온다.
        System.out.println("# : 분노" + rage);

    }

    public void fireSlash() {
    }

}
