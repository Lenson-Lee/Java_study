package day19.inter;

public class Cat implements Pet {
    @Override
    //public void playInHouse() { 인터페이스를 통해 play 추상화로 사용하지 않아도 된다.
    public void play() {
        System.out.println("고양이는 캣타워에서 놀아요~");

    }

}
