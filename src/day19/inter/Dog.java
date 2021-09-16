package day19.inter;

public class Dog extends Animal implements Pet {
    @Override
    public void play() {
        System.out.println("강아지는 뛰면서 놀아요~");

    }

}
