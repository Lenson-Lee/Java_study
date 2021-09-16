package day19.inter;

public class Person {

    //애완동물을 가져야 하는데 Dog Cat을 공통으로 만들 필드가 없다 => 상속을 통해 둘을 엮어서 처리해왔지만 이제는 인터페이스를 사용한다. 같은 개념

    //인터페이스 만들고? public class Cat/Dog에  inplements Pet으로

    //애완동물들
    Pet[] myPets = {new Dog(), new Cat()};

    //애완동물들과 노는 기능
    public void playWithPets() {
        //iter 단축키
        for (Pet myPet : myPets) {
            myPet.play();//고양이에는 play가 없어서 프로젝트 뒤집어 엎어야 한다 => play를 오버라이딩 했으면 이럴 일도 없었는데!!

        }
    }

}
