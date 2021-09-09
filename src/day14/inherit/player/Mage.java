package day14.inherit.player;

public class Mage extends Player {

    int mana;

    public Mage() {
    }

    public Mage(String nickName, int level, int hp, int mana) {
        this.nickName = nickName;
        this.level = level;
        this.hp = hp;
        this.mana = mana;
    }

    @Override
    public void info() {
        System.out.println("\n=========== Mage info ==========");
        System.out.println("# 닉네임: " + nickName);
        System.out.println("# : 레벨" + level);
        System.out.println("# : 체력" + hp);
        System.out.println("# : 마력" + mana);
    }

    public void meteor() {}

}
