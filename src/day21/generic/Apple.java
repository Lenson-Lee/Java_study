package day21.generic;

public class Apple implements Fruit {
    //제네릭은 복제라는 뜻

    //alt insert => toString

    //그냥 값을 불러오면 주소값이 나오지만 투스트링을 통해 문자열로 값이 나온다.
    @Override
    public String toString() {
        return "사과입니다.";
    }
}
