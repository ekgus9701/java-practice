package day03;

public class EX06 {

  public static void main(String[] args) {
    //Apple phone: 배터리 용량 Battery Capacity 정수형으로 표현 100
    //charge() 메소드 배터리 +10
    //useKakaotalk() 메소드 배터리-5됨
    //useYoutube() 메소드 배터리 -10됨
    // 배터리 용량 확인
    //turnOn
    //turnOff
    //isOn

    //Person => ApplePhone 모든 기능

    ApplePhone applePhone = new ApplePhone();
    Person person = new Person();
    person.buyPhone(applePhone);

    //SamsungPhone Apple이랑 같은 기능 배터리 120, charge+12 카톡 -7 유튜브 -13
  }
}

class Person {

  ApplePhone applePhone;

  //buyPhone()
  void buyPhone(ApplePhone applePhone) {
    this.applePhone = applePhone;
  }

  void useKakaotalk() {
    if (applePhone.getIsOn()) {
      applePhone.operateKakaotalk();
    }
  }

  void useYoutube() {
    if (applePhone.getIsOn()) {
      applePhone.operateYoutube();
    }
  }

  void chargePhone() {
    applePhone.charge();
  }


}

class ApplePhone {

  private final int BATTERY_CAPACITY = 100; //배터리 최대 용량, 상수로 표현
  private int batteryStatus = 70;
  private boolean isOn = true;

  boolean getIsOn() {
    return isOn;
  }

  void charge() {
    if (batteryStatus == 100) {
      System.out.println("100%입니다!");
      return;
    } else if (batteryStatus <= 90) {
      batteryStatus += 10;

    } else {
      batteryStatus = 100;

    }
    System.out.println(batteryStatus + "%로 충전되었습니다!");
  }

  void operateKakaotalk() {
    if (isOn) {
      if (batteryStatus > 5) {
        batteryStatus -= 5;
      } else {
        batteryStatus = 0;
        turnOff();
      }
    }

  }

  void operateYoutube() {
    if (batteryStatus > 10) {
      batteryStatus -= 10;
    } else {
      batteryStatus = 0;
      turnOff();
    }
  }

  void checkBattery() {
    System.out.println(batteryStatus + "% 입니다.");
  }

  void turnOn() {
    if (!isOn) {
      isOn = true;
    }
  }

  void turnOff() {
    if (isOn) {
      isOn = false;
    }
  }

}

