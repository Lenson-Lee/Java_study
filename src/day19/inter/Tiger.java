package day19.inter;

//extend 먼저, implements 나중에
public abstract class Tiger extends Animal implements Huntable, Violent {    //알트엔터 => 메서드 구현으로 오버라이드 자동생성 가능

    @Override
    public void hunt(String target) {
        System.out.println("호랑이는 냥펀치로 사냥합니다.");
    }

    @Override
    public void attack() {

    }
}
