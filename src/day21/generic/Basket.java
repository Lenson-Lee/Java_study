package day21.generic;

//<>속은 내 맘대로. Fruit     제너릭, 복제타입 설정.
public class Basket<F extends Fruit> {
    //<F>타입은 제너릭타입
    private F f;

    public F getF() {
        return f;
    }

    public void setF(F f) {
        this.f = f;
    }
}
