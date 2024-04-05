package day03;

public class EX05 {

  public static void main(String[] args) {
    //OTT : Netflix, Tving
    //netflix.play()-> printOpening
    //                sout "영상 시작"
    //printOpeningLogo() : sout "넷플" "티빙"

    //netflix.finish() : sout "다 봤다~"
    OTT ott = new OTT();
    Netflix netflix = new Netflix();
    Tving tving = new Tving();

    netflix.play();
    netflix.finish();

    tving.play();
    tving.finish();

  }
}

class OTT {

  void play() {
    printOpening();
    System.out.println("영상 시작");
  }

  void printOpening() {

  }

  void finish() {
    System.out.println("다 봤다~");
  }

}

class Netflix extends OTT {

  @Override
  void printOpening() {
    System.out.println("넷플");
  }
}

class Tving extends OTT {

  @Override
  void printOpening() {
    System.out.println("티빙");
  }
}
