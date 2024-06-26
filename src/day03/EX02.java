package day03;

public class EX02 {

  public static void main(String[] args) {
    Parent parent1 = new Parent();
    parent1.method();

    Child child = new Child();
    child.method();

    Parent parent2 = new Child();
    parent2.method();
//    parent2.metod();

    Child child2 = (Child) parent2;
    child2.metod();
  }

}

class Parent {

  void method() {
    System.out.println("부모 메소드");
  }


}

class Child extends Parent {

  //Override는 컴파일러에세 syntax error를 잡아달라고 하는 것임!!!
  @Override
  void method() {
    System.out.println("자식 메소드");
  }

  void metod() {
    System.out.println("자식 메소드");
  }


}