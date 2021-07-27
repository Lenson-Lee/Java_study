package day01;

//    폴더명 최대한 영어랑 숫자만 이용 언더바 한글 지양하기
//    alt+1 메뉴 축소
//    insert키 누르면 블럭씌우듯이 선태고딘다...
//    ctrl+shift+f10 실행하기
//    ctrl+D 복사하기
public class variable {


    //실행 코드들은 main함수 내부에서 작성해야 한다.
    public static void main(String[] argt) {

        //변수 선언
        int number;
//        System.out.println(number);
        number = 100;

        //선언타입이 다른 값은 저장 불가
        int point = 78;
//        point = 78.99;
        int copyNum = number * 3;
        System.out.println("coppyNum =" + copyNum);
        //soutv
//        System.out.println("copyNum = " + copyNum);
        //문자열 저장시에는 String타입 사용
        String nickName = "뽀로로";
        //문자열값에는 반드시 겹따옴표만 사용. 빽팁, 작은따옴표 금지.

//        int n1 = 10;
//        int n2 = 20;
        //자바 변수 스코프(유효 범위) : 블록 스코프(탄생한 자기블록에서만 사용 가능
        int n1 = 10, n2 = 20;

        if (true) {
            int n3 = n1 + n2;
        }//end if
        //블록스코프로 n3는 if 안에서만 사용 가능. 나가는 순간 n3 사라짐. if문 밖에 n3가 정의되어 있다면 사용 가능(엄밀히 말하면 다른 변수n3)



    }//end main
}//end class