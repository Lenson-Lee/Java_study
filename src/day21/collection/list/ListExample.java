package day21.collection.list;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 주석 달 때 슬레시 / 하고 별별 ** 엔터하면 이런 주석이 나온다! 다 쓰면 왼쪽 책 모양 눌러서 보기좋은 모드로 두면 된다. javadoc.
 * 코드설명 쓸 떄 사용하기 좋음
 *
 * @version 1.0,0
 * @author 김철수
 * @description 알리셩
 * @param <E> - E는 뭔지 어쩌고저쩌고
 */
public class ListExample {

    public static void main(String[] args) {


        //리스트: 순차형 자료 구조, 데이터가 순서대로 저장, 중복저장 허용, 인덱스를 가짐

        //String[]  sArr = new String[10];//탐색, 변경, 삭제등 어려운 경우가 생김.
        //배열리스트
        List<String> sList = new ArrayList<>();

        //add(): 리스트에 객체를 추가. 몇 개든 가능.
        sList.add("0번 인덱스에 멍멍이");
        sList.add("1번 인덱스에 멍멍이");
        sList.add("2번 인덱스에 멍멍이");

        System.out.println(sList);

        //size(): 저장된 객체의 수 확인
        int size = sList.size();
        System.out.println("size = " + size);

        //add(index, object) : 중간에 삽입.
        sList.add(2, "어흥이");
        System.out.println(sList);

        //set(index, obj) : 객체 수정
        sList.set(3, "메롱이");
        System.out.println(sList);

        // remove(idx), remove(obj) 둘 다 가능
        sList.remove("어흥이");
        sList.remove(1);

        System.out.println(sList);

        //get(index) : 리스트에서 객체 참조
        String s = sList.get(2);
        System.out.println("s = " + s);

        //indexOf(obj) : 저장객체 인덱스 탐색. 탐색실패하면 -1 반환
        int index = sList.indexOf("메롱이");
        System.out.println("index = " + index);


        //contains(obj) : 객체의 저장 유무 확인
        boolean b = sList.contains("귀뚜라미");
        System.out.println("b = " + b);

        //List의 반복문 처리
        for (int i = 0; i < sList.size(); i++) {
            System.out.println(sList.get(i));
        }

//        System.out.println("=============================");
//        for (String str : sList) {
//
//            System.out.println(str);
//        }
//
//        //clear(): 리스트 내부 객체 전체 삭제
//        sList.clear();
//        System.out.println(sList);
//        System.out.println(sList.size());
//        System.out.println(sList.isEmpty());

        //초기값을 가진 리스트
//        int[] iArr = {10, 20. 30};
        List<Integer> numbers = new ArrayList(){
            //Arrays.asList(10, 20, 30, 5, 8, 56,2);
        };

        System.out.println(numbers);

        //오름차 정렬
        numbers.sort(Integer::compareTo);   //String 일 때는 Integer 교체

        //내림차 정렬
        numbers.sort(Comparator.reverseOrder());


    }
}