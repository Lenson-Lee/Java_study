package day05;

public class ForQuiz {
    public static void main(String[] args) {

        int n = (int) Math.random() * 8 + 2;
        int i;
        int total = 0;

        System.out.printf("랜덤구구단 %d단\n", n);
        System.out.println("============");
      for (i=1; i<10; i++){
          total = i*n;
          System.out.printf("%d x %d = %d\n", n, i, total);

      }
    }
}
