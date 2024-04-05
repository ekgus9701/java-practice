package day01;

//실행을 위한 클래스
public class EX05 {

  public static void main(String[] args) {

    //자료형 : 변수에 담길 데이터 형태
    Product product = new Product(); //호출할 때는 생성자 앞에 new 붙이기
    Computer computer = new Computer();
  }
}

// 객체를 만들기 위한 클래스

// 상품 클래스
class Product {

  // 생략 - 이걸로 어떻게 객체를 만들 수 있는지
  // 생성자 = 클래스로 객체를 만들 수 있는 방법
  Product() {

  }

}

class Computer {

  Computer() {

  }
}
