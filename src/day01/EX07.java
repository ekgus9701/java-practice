package day01;

public class EX07 {

  public static void main(String[] args) {
    //객체(브랜드)
    //2개: 삼성, LG
    //객체의 변수 출력

    Notebook samsung = new Notebook("samsung");
    System.out.println(samsung.brand);
    Notebook LG = new Notebook("LG");
    System.out.println(LG.brand);

  }
}

//노트북 클래스, 브랜드

class Notebook {

  String brand;

  Notebook(String brand) {
    this.brand = brand;
  }


}
