package day05;

public class EX03 {

  int _quantity;
  int _itemPrice;

  int discountLevel;

  EX03(int quantity, int itemPrice) {
    this._quantity = quantity;
    this._itemPrice = itemPrice;
  }

  int getDiscountLevel() {
    return discountLevel;
  }

  double getDiscountedPrice() {
    return _quantity * _itemPrice * 0.8;
  }

  void method() {

    //클린코드 입장에서 지역변수는 없는게 좋음
    // int basePrice = _quantity * _itemPrice;

    double discountedPrice = getDiscountedPrice();
    System.out.println("최종 금액은 " + discountedPrice + "달러 입니다.");
  }
}
