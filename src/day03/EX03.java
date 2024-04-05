package day03;

public class EX03 {

  public static void main(String[] args) {
    //class Garden
    //getSound() : 매개변수.cry()
    //class Dog, Cat extends Pet
    Dog dog = new Dog();
    Cat cat = new Cat();
    Garden garden = new Garden(cat, dog);
    garden.getSound(cat);
    garden.getSound(dog);
  }


}

class Garden {

  Cat cat;
  Dog dog;

  Garden(Cat cat, Dog dog) {
    this.cat = cat;
    this.dog = dog;
  }

  void getSound(Pet pet) {
    //instanceof를 활용해서 이렇게 표현할 수 있음
//    if(pet instanceof Cat){
//      System.out.println("야옹");
//    }
    //하지만 아래처럼 다형성을 활용하는 게 더 나음!
    pet.cry();
  }
}


abstract class Pet {

  abstract void cry();


}

class Dog extends Pet {

  @Override
  void cry() {
    System.out.println("명멍");
  }
}

class Cat extends Pet {

  @Override
  void cry() {
    System.out.println("야옹");
  }
}
