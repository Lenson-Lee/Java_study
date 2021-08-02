package day05;

public class LoopNesting {
    public static void main(String[] args) {

        //( i , j) (0,0)(0,1)(0,2)(0,3)(1,0)...(4,3)처럼 바깥 한 번 당 안쪽 전부 돌림.
        //for문은 false가 나올떄까지 못 나온다.


        //fori
        for (int i = 0; i < 5; i++) {
            System.out.println("outer" + i);
            for (int j = 0; j <4 ; j++) {
                System.out.println("inner" + j);
            }//end inner for
            System.out.println("===========================");
        }//end outer for
    }//end main
}//end class
