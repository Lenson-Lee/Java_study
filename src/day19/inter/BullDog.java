package day19.inter;

        //Dog 가 Animal 한테 받아서 name, age 받는다
public class BullDog extends Dog implements Pet, Huntable{  //인터페이스의 경우 상속과 다르게 여러개의 경우 컴마로 겹처서 가능하지만 공통필드가 불가능해서 그럴 때 상속 사용하면 된다.

    @Override
    public void hunt(String target) {
        System.out.println("불독은 근육으로 사냥해요~");
    }
}
