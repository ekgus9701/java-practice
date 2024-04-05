package day03;

public class EX01 {

  public static void main(String[] args) {
    //Cow, Chicken: cry() - "음메" "꼬끼오"
    //Farm: getSound() - cow, chicken . cry()호출
    //Animal: 상속 - 오버라이딩
    Cow cow = new Cow();
    Chicken chicken = new Chicken();
    Farm farm = new Farm(cow, chicken);
    farm.getSound(cow);
    farm.getSound(chicken);

  }
}

class Farm {

  Cow cow;
  Chicken chicken;

  Farm(Cow cow, Chicken chicken) {
    this.cow = cow;
    this.chicken = chicken;
  }

  void getSound(Animal animal) {
    //객체 생성을 메소드 안에서 하는 것은 지양해야 함!
    // Cow cow = new Cow();
    animal.cry();
  }
}

class Animal {

  //비어있는 메소드 : 추상 메소드, 자식클래스에서 선언하라고 표시
  void cry() {

  }

  ;


}

class Cow extends Animal {

  @Override
  void cry() {
    
    System.out.println("음메");
  }
}

class Chicken extends Animal {

  @Override
  void cry() {
    System.out.println("꼬끼오");
  }

}
