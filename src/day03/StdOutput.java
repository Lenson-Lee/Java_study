package day03;

public class StdOutput {

    //Std = standardoutput 줄여썼음
    public static void main(String[] args) {
    String dog = "멍멍이";
    String cat = "야옹이";

    System.out.print(dog);
    System.out.print(dog + "\n");
    System.out.println(cat);
    System.out.print(cat);

    String filePath = "D:\\temp\\new.jpg";
    System.out.println(filePath); //\t와 \n이 줄 개행으로 인식되어서 문제가 생긴다. => \\으로 사용해서 특수기호임을 인식시킨다.

    String msg = "He said \"warning!\" to me."; //string을 나타내는 "이 아니라 인용구 특수문자임을 나타냄
    System.out.println("msg =" + msg);

    int month = 7;
    int day = 17;
    String anni = "제헌절";

    System.out.println(month + "월" + day + "일은" + anni + "입니다.");

    //souf
    System.out.printf("%d월 %d일은 %s입니다.\n", month, day, anni); //C언어방식 참고
    System.out.println("안녕");
    //printf는 println처럼 안되서 줄개행 \n을 꼭 써주어야 한다. C언어방식

    double saleRate = 0.25;
    // %f는 소숫점 여섯번째까지 표현한다. 0.250000  => %.숫자f는 그 자리수까지 표현해준다.
    System.out.printf("오늘의 할인율은 %.2f%%입니다.\n", saleRate*100);

    //자바는 에러문구 첫 줄이 포인트다. 해석: 포멧에러. %s가 없다
    //Exception in thread "main" java.util.MissingFormatArgumentException: Format specifier '%s'
                                    //=====================================  =====================
    //Exception in thread "main" java.util.UnknownFormatConversionException: Conversion = '입'
    //: UnknownFormat이다. => System.out.printf("오늘의 할인율은 %.2f%입니다.\n", saleRate*100);에서 2f%로 인식하기 때문? %%두개로 붙이기
    }
}
