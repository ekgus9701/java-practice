package day02;

public class EX02 {

  public static void main(String[] args) {
    Coffee coffee1 = new Coffee(4500);
    //coffee1.price = 4500; //이런 식으로 쓸 수도 있음, 하지만 권장 x, 밖에서 마음껏 접근이 되니까 마음대로 바꿔져서
//    coffee1.setPrice(6000);
    //coffee1.getInfo();

    Barista chunsik = new Barista("춘식");

    chunsik.getCoffeeInfo(coffee1);
    //-> "이 커피는 4500원입니다." 출력되어야한다.
    chunsik.makeCoffee();
    //-> "커피 여기 있습니다~"
  }

}

//Coffee
//필드: 가격, 핫 or 아이스, 사이즈
//메소드: getInfo -sout(가격, 온도, 사이즈)

class Coffee {

  private int price; //멤버변수(필드)


  Coffee(int price) {
    this.price = price;

  }

  void setPrice(int price) {
    //필드값 설정 'set'
    //변경할 값을 검증하는 용도로도 사용된다!
    if (price >= this.price) {
      this.price = price;
    }

  }

  int getPrice() {
    return this.price;
  }

  void getInfo() {
    System.out.println("이 커피는 가격이 " + price + "원입니다.");


  }
}

class Barista {

  private String name;

  Barista(String name) {
    this.name = name;
  }

  void getCoffeeInfo(Coffee coffee) {
    System.out.println("이 커피는 " + coffee.getPrice() + "원입니다.");
  }

  void makeCoffee() {
    System.out.println("커피 여기 있습니다~");
  }
}

