package day17.abs;

public class Main {

    public static void main(String[] args) {
        //    여기서 ctrl alt v
        //    new Driver(new Avante("아반뗴", 2000))

        //                          Avante 면 아반뗴가 달립니다가 뜨는데 페라리는 오버라이딩 안했나? 자동차가 달린다고 뜨지? => 페라리는 start()로 하지 않고 run()으로 해서 Car 의 원본이 나와버렸다. 산타페 또한 같은 원리

        Driver kim = new Driver(new Ferrari("아반뗴", 2000));
        kim.drive();

        //new Car(); => 쓸 일이 없다. new Avante, new Ferrari 등으로 쓰겠지..


    }
}
