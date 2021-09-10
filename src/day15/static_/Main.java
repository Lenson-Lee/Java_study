package day15.static_;

import day14.protected_.pac2.C;

public class Main {
    public static void main(String[] args) {

        Count c1 = new Count();
        c1.x = 5;
        //c1.y = 10;
        Count.y = 10;

        Count c2 = new Count();
        c2.x++;
        //c2.y++;
        Count.y++;

        //soutv
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("======================");
        System.out.println("c1.y = " + c1.y);
        System.out.println("c2.y = " + c2.y);
        
        Count c3 = new Count();
        //c3.y += 40;
        Count.y += 40;

        System.out.println("c3.y = " + c3.y);

        //m1();//누구를 통해 부르는지 알려야 해서 c1.m1()식으로 쓴다
        c1.m1();
        c2.m1();

        Count.m2(c3);

//        Calculator sharpCal = new Calculator("샤프", "파랑");
//        sharpCal.paint("빨강");

        //Calculator.calcAreaCircle(5);
        //System.out.println("result = " + result);




    }
}
