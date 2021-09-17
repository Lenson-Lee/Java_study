package day20.api.lang.obj;

public class Main {

    public static void main(String[] args) {
        Member member = new Member("김철수", 30, "탄방동");//ctrl alt v로 변수에 저장

        System.out.println(member); //member.toString()이 생략되어서 member가 나오는 것이다, 16진수로 주소가 나온다,ctrl로 toString들어가보면 알 수 있따.

    }
}
