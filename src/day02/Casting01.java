package day02;

public class Casting01 {

    public static void main(String[] args) {
        //묵시적 형변환(promotion, upcasting)
        byte a = 100;
        int b = a;
        //1byte가 4byte로 바껴서 int b에 들어간다. :a가 byte타입에서 int로 승격된다.

        double c = b; //b가 int타입에서 double타입으로 승격된다.

        System.out.println("c = " + c);
        
        //명시적 형변환(downcasting)
        int n = 1000;
        byte m = (byte) n; //n을 byte에 강제로 넣으라는 뜻
        //굉장히 위험해서 어긋날 수 있따. 
        System.out.println("m = " + m);
        
    
        double d = 500.1234;
        int i =(int) d;
        System.out.println("i = " + i);

        char r = 'A';
        int o = r;
        short p = (byte) o;
        System.out.println("p = " + p);




    }
}
