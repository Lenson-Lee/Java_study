package day20.api.lang.obj;

public class Member  {  //extend Object

    String name;
    int age;
    String address;

    //위에 세 줄 전체 alt insert => toString 하면 밑에 오바라이딩 굳이 안써도 생성된다!!!


    public Member(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("이름: %s, 나이: %d, 주소: %s", this.name, this.age, this.address);//format은 printf처럼 사용 가능
   }

}
