package day21.collection.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Student {
    String name;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    int age;
}

public class MapExample {

    public static void main(String[] args) {
        //Map: key,value의 쌍으로 데이터를 관리
        // key는 중복저장 불가능, value는 가능.

        Map<String, Student> students = new HashMap<>();

        //put(k, v) : 맵에 데이터 추가
        students.put("멍멍이", new Student("철수", 7));
        students.put("냥냥이", new Student("미애", 45));
        students.put("짹짹이", new Student("경희", 18));

        System.out.println(students);

        //중복된 key를 put 하면 value가 수정된다.(기존데이터 날아감) => 중복되는 코드 있는지 체크하고 수정해야함.
        students.put("냥냥이", new Student("박희", 45));
        System.out.println(students);

        //get(key) : map에 저장된 객체 참조. value 리턴해줌.?
        Student s = students.get("멍멍이");
        System.out.println("s = " + s);

        int age = students.get("냥냥이").age;//age가 마지막에 있어서 age를 반환하는 int


        //containsKey(k) : map에 저장된 key 존재 유무 확인
        System.out.println(students.containsKey("깎깍이"));
        System.out.println(students.containsKey("짹짹이"));

        //map의 반복문 처리
        //for(String data : students) {     forEach 하려면 이터러블 구현받아야하는데 Map 에 들어가보면 extends 가 없어서불가능. Set 은 extends 따라 들어가보면 있어서 가능.

        Set<String> keys = students.keySet();
        System.out.println(keys);
        for (String key : keys) {
            System.out.println(students.get(key));
        }

        //remove(key) : 특정 데이터셋(entry) 삭제
        students.remove("짹짹이");
        System.out.println(students.size());
        System.out.println(students);

        students.clear();
        System.out.println(students.isEmpty());

    }
}





