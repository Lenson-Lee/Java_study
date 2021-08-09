package day09;

public class MethodQuiz2 {

    //문제 조건: num배열의 수의 총점과 평균이 나오는 arrTotAvg배열을 만드시오.
    //정수 배열이나 정수 값 목록을 전달할 시 해당 정수의 총합과 평균을 리턴하는 메서드 calc필요.


    static int calcArrayTotal() {

        int[] numbers = {57, 89, 78, 91, 93, 47};
        int total = 0;

        //총합 반복문.
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
            System.out.printf("%d\n", total);
        }
        return total;

    }

    static double calcArrayAvg () {
        double avg = calcArrayTotal() / 6;
        return avg;
    }


    public static void main(String[] args) {
        System.out.printf("총점: %d, 평균: %.2f ", calcArrayTotal(), calcArrayAvg());
    }


}
