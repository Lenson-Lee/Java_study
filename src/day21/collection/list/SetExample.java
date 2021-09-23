package day21.collection.list;

import java.util.HashSet;

public class SetExample {
    public static void main(String[] args) {
        //Set: 중복 저장 허용X, 순서 없이 빠르게 저장, 전제탐색속도 빠름
        //순서대로 나오는게 아니어서 순서탐색용으로 사용하면 안된다.

        //Set set = new Set(); (X) set이 인터피에스여서.
        HashSet set = new HashSet();

        //add(obj): set에 객체 추가
        set.add("김말이");
        set.add("단무지");
        set.add("김밥");
        set.add("김말이");
        set.add("닭강정");

        System.out.println("size = " + set.size());
        System.out.println(set);

        //set 반복문 처리(인덱스가 없어서 인핸스드 for loop 사용.
        //iter
        //char배열이 itarable을 구현 안해서 그렇다.(implements iterable이 해당 속성?에 있어야한다..
//        for (String s : set) {
//            System.out.println(s);
//        }

        //remove(obj) : set의 객체 삭제
        set.remove("단무지");
        System.out.println(set);

        set.clear();
        System.out.println(set);
        System.out.println(set.isEmpty());



    }

    private static class Set<T> {
    }
}
