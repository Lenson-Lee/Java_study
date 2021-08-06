package day09;

public class Parameter {
    //랜덤으로 음식명 하나를 리턴하는 메서드
    static String chooseRandomFood() {
        String[] foods = {"짬뽕", "볶음밥", "치킨", "삼겹살", "파스타"};
        return foods[(int) (Math.random() * foods.length)];
//        int rn = (int) (Math.random() * foods.length);
//        return foods[rn]; //한 번 쓰는 코드니까 [rn]에 커서 대고 ctrl+ alt + n 리팩토링
    }
//ctrl + alt + j



    //전달받은 2개의 정수의 합을 구해서 리턴하는 메서드
    static int addTwo(int n1,int n2) {
        return n1 + n2;
    }

    //전달받은 n개의 정수의 합을 구해 리턴하는 메서드
    static int calcNumbersTotal(int[] numbers) {
        int total = 0;
//        iter
        for (int n : numbers) {
            total += n;
        }
        return total;
    }

    //전달받은 n개의 정수의 합을 구해 리턴하는 메서드
    //상위호환버전. (1,2,3,4,) ,(nums) 같이 배열 직접 넣어도 되고, 배열명을 넣어도 된다.
    //2차원 배열같은 경우에는 (int[][] numbers)로 그대로 받는거 추천.
    static int calcNumbersTotal2(int... numbers) {
        int total = 0;
//        iter
        for (int n : numbers) {
            total += n;
        }
        return total;
    }


    public static void main(String[] args) {
        String randomFood =  chooseRandomFood();

        System.out.println("randomFood = " + randomFood);

        System.out.println(addTwo(20, 30));
        
        int[] nums = {10, 20, 30};
        int total = calcNumbersTotal(nums);
        System.out.println("total = " + total);

        int total2 = calcNumbersTotal(new int[]{50, 100, 200});
        System.out.println("total2 = " + total2);

        calcNumbersTotal2(10, 20, 30, 40);
    }
}
