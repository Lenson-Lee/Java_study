package day09;

public class MethodQuiz1 {

    static int calcDivisor(int target) {

        int total = 0;
        System.out.printf("%d의 약수: ", target);

        for (int i = 1; i <= target ; i++) {
            if(target % i == 0) {
                System.out.printf("%d, ", i);
                total += i;
            }
        }
        return total;
    }


    public static void main(String[] args) {

        System.out.println("\n10의 약수의 총합: " + calcDivisor(10));
        System.out.println("==============================");
        System.out.println("\n30의 약수의 총합: " + calcDivisor(30));
    }

    //약수를 구하고 약수의 총합을 구하기




}
