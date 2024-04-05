package day03;

public class EX04 {

  public static void main(String[] args) {
    //레시피 - 슈퍼클래스 역할 : getInfo 이 레시피는 ~의 레시피입니다
    // 파스타 레시피 - 자식 : makeSource 소스를 만듭니다
    //스테이크 레시피 - 자식 : grill 고기를 굽습니다
    Recipe recipe = new Recipe("냠냠 ");
    PastaRecipe pastaRecipe = new PastaRecipe("파스타 냠");

    SteakRecipe steakRecipe = new SteakRecipe("스테이크 냠");


  }
}

class Recipe {

  String name;

  Recipe(String name) {
    this.name = name;
  }

  void getInfo() {
    System.out.println("이 레시피는 " + name + "셰프님의 레시피입니다.");
  }


}

class PastaRecipe extends Recipe {

  PastaRecipe(String name) { //부모클래스의 생성자에 매개변수가 있으면 생성자 기본으로 못만듦 -> 써줘야함
    super(name);
  }

  void makeSource() {
    System.out.println("소스를 맛있게 만듭니다");
  }
}

class SteakRecipe extends Recipe {

  SteakRecipe(String name) {
    super(name);
  }

  void grill() {
    System.out.println("스테이크를 맛있게 굽습니다");

  }
}


