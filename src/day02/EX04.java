package day02;

public class EX04 {

  // 상속
  public static void main(String[] args) {
    Bus bus = new Bus();
    bus.ride();
    bus.getWheelNum();
    bus.belling();
    //Car bus = new Bus(); 오류 안남! 자식이 필요한 데이터를 더 추가해서 만듦

    Taxi taxi = new Taxi();
    taxi.ride();
    taxi.getWheelNum();
  }

}


//자식 클래스 먼저 설계하고 부모 클래스 설계하는게 편함,
//자식클래스들 공통된 특징 묶어서 다형성을 고려해서 부모클래스 만들면 됨
//자식클래스는 부모클래스에 있는 내용 그대로 받아와서 쓸 수 있음
//원한다면 자식클래스에서 재정의도 가능
class Car {

  int wheel = 4;

  void getWheelNum() {
    System.out.println("바퀴 " + wheel + "개 입니다.");
  }

  void ride() {
    System.out.println("부앙");
  }
}

//버스
//택시
//메소드: 달린다 (버스-부릉부릉, 택시-빵빵)
class Bus extends Car {

  //자식 클래스에는 super()을 포함한 생성자가 기본으로 생략되어있음!
  Bus() {
    super(); //부모 생성자를 호출한다
  }

  void ride() {
    System.out.println("부릉부릉");
  }

  void belling() {
    System.out.println("삐이이");
  }
}

class Taxi extends Car {

  void ride() {
    System.out.println("빵빵");

  }
}
