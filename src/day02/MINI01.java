package day02;

//핸드폰 켜는 메소드
//핸드폰이 켜지는 메소드

public class MINI01 {

  public static void main(String[] args) {
    Person sonny = new Person("쏘니", 1, "Samsung");
    sonny.buyPhone();
    Person beckham = new Person("베컴", 2, "Apple");
    beckham.buyPhone();
    Phone sonnysPhone = new Phone("삐비빅");
    sonny.turnOn(sonnysPhone);

    Phone beckhamsPhone = new Phone("bbeep");
    beckham.turnOn(beckhamsPhone);

  }

}

class Person {

  String name;
  int nationality; //1이면 한국, 2이면 외국
  String phoneType;
  boolean havePhone;

  Person(String name, int nationality, String phoneType) {
    this.name = name;
    this.nationality = nationality;
    this.phoneType = phoneType;
  }

  void buyPhone() {
    if (this.nationality == 1) {
      System.out.println(this.name + "가 " + this.phoneType + " 핸드폰을 샀습니다.");

    }
    if (this.nationality == 2) {
      System.out.println(this.name + "도 " + this.phoneType + " 핸드폰을 샀습니다.");

    }
    this.havePhone = true;


  }


  void turnOn(Phone phone) {
    if (this.havePhone) {
      if (this.nationality == 1) {
        System.out.println(this.name + "가 핸드폰을 켰습니다.");
        System.out.println("야 내 핸드폰 켜볼게");

      } else {
        System.out.println(this.name + "도 핸드폰을 켰습니다.");
        System.out.println("turn on");
      }

      if (!phone.getOn()) {
        phone.turnOn();
      }
    }

  }

}

class Phone {

  private String sound;
  private boolean on;

  Phone(String sound) {
    this.sound = sound;
  }

  boolean getOn() {
    return this.on;
  }

  void turnOn() {
    System.out.println(this.sound);
  }

}

class SamsungPhone extends Phone {

  SamsungPhone(String sound) {
    super(sound);
  }
}

class ApplePhone extends Phone {

  ApplePhone(String sound) {
    super(sound);
  }
}
