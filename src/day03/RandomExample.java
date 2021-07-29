package day03;

public class RandomExample {
    public static void main(String[] args) {

        //Math.random(): 0.0이상 1.0미만의 실수 난수 생성
        double rn = Math.random();
        System.out.println("랜덤값:" + rn);

        //정수형 난수 만들기 1이상 11미만
        //floor가 double값을 받아서 int사용 못함.
        //빨간줄만 보이면 alt + enter 거의 첫번째 문구가 정답.
        int ri = (int) (Math.random() * 10 + 1);
//        double ri = (Math.floor(Math.random() * 10) + 1; => 뒤에 .0이 왜 붙어..

        System.out.println("랜덤정수:" + ri);

        /*
            랜덤 정수 생성방법
            #1 이상 10이하의 랜덤 정수 생성
            Math.random()       -> 0.0 <= ~ < 1.0
            Math.random() * 10  -> 0.0 <= ~ < 10.0

            int로 형변환 하면 소숫점이 없는 정수!
            (int)(Math.random() * 10)   -> 0 <= ~ 10
            (int)(Math.random() * 10) + 1   -> 1 <= ~ 11 (1부터 10까지)

           #공식: x이상 y 이하의 랜덤정수
            (int)(Math.random() * (y-x+1) + x
        */


    }
}
