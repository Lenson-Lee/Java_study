package day14.inherit.player;

public class Hunter extends Player {

    String beast;

    public Hunter() {
    }
    public Hunter(String nickName, int level, int hp, String beast) {
        this.nickName = nickName;
        this.level = level;
        this.hp = hp;
        this.beast = beast;
    }
    @Override
    public void info() {
        System.out.println("\n=========== Hunter info ==========");
        System.out.println("# 닉네임: " + nickName);
        System.out.println("# : 레벨" + level);
        System.out.println("# : 체력" + hp);
        System.out.println("# : 동물" + beast);

    }
    public void thunderShot() {}
}
