package day18.exception;

public class FinallyExample {

    public static void main(String[] args) {

        String[] pets = {"비둘기", "거북이", "이구아나"};

        for (int i = 0; i < 4; i++) {
            try {
                System.out.println(pets[i] + "키울거야!");
            } catch (Exception e) {
                System.out.println("애완동물 정보가 없습니다.!");
            } finally {//에러가 나든 안나든 상관없이 작동
                //메모리 해제 코드(DB나 네트워크 연결시, 하드디스크,등 에 주로 사용)
                System.out.println("애완동물 좋아요~~");
            }
        }//for end

        System.out.println("프로그램 정상 종료!");
    }//main end
}