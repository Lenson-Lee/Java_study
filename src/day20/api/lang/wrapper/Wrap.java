package day20.api.lang.wrapper;

public class Wrap {

    static int x;
    static Integer y;



    public static void main(String[] args) {
        //int 와 Integer 의 차이점
        System.out.println("x = " + x); // = 0
        System.out.println("y = " + y); // = null   (null 은 연산이 불가능)

        x = 5;
        y = 7;
        System.out.println(x + y);

        //int[] arr = {5, 8.8, "hello"};
        //int 가 아니라 Integer 였다면 object 랑 상속관계가 생겨 (object 배열이 된다는 뜻) 그 이외에는 별 차이 없어서 필요할 때만 Wrapper 로 쓰면 된다
        Object[] arr = {5, 8.8, "hello"};

        int n = 100;    //인티저로 쓰고싶으면 밑에로 바꿔서 쓰면 된다
        Integer m = n;  //String 과 같이 굳이? 싶어서 원래 문법 줄여서 쓴다.

        //나머지 Wrapper 들은 그냥 첫글자만 대문자 인거 쓰고 , Character 와 Integer 는 풀네임 인거 주의!

        //문자열 변환 기능
        String s1 = "90";
        String s2 = "5.11";

        int i = Integer.parseInt(s1);
        double d = Double.parseDouble(s2);
        System.out.println(i + d);


    }
}
