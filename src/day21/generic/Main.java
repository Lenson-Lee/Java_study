package day21.generic;

import day11.fruit.Banana;

public class Main {

    public static void main(String[] args) {

/*
        AppleBasket ab = new AppleBasket();
        ab.setApple(new Apple());
        System.out.println(ab.getApple());
*/

        Basket<Apple> ab = new Basket<>();
        ab.setF(new Apple());
        System.out.println(ab.getF());

        //생성자로 부르면 <> 속에 굳이 안넣어도 타입에서 지정이 되어있어서 괜찮다. 그래도 <>는 남겨야함

        //강사쌤코드 복사하기 ;; main이랑.
//        Basket<Banana> bb = new Basket<>();
//        bb.setF(new Banana());
//        System.out.println(bb.getF());
//
//
//        Basket<Water> wb = new Basket<>();


    }
}
