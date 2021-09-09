package day14.inherit.player;

public class Main {

    //메인 클래스 만들면 무조건 메인 메서드 만들기~!!
    public static void main(String[] args) {

        Warrior w = new Warrior();  //type 이 Warrior 인것.
        w.fireSlash();
        w.rage = 60;
        //w.mana = 50;    Warrior 것이 아니어서 안된다.
        w.nickName = "전사왕파괴신";  //부모 클래스에서 상속받아서 오류가 안 난다.
        w.level = 5;
        w.hp = 100;
        w.info();//상속


        Mage m = new Mage();
        m.nickName = "눈보라왕";
        m.level = 4;
        m.hp = 87;
        m.mana = 50;


        m.meteor();
        m.info();



    }//main end

}
