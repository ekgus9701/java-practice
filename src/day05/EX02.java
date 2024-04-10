package day05;

public class EX02 {

  //블루투스 마이크(스피커가 포함되어 있음)

  //인터페이스 or 추상클래스
  //-> 블루투스 스피커 : BGM(음악)
  //-> 마이크 : 노래를 부를 수 있음
  //class BluetoothMic
  //-> 음악도 나오고 노래도 부를 수 있음
  public static void main(String[] args) {
    BluetoothMic bluetoothMic = new BluetoothMic();
    bluetoothMic.playMusic();
    bluetoothMic.amplifyMusic();
  }


}

interface BluetoothSpeaker {

  void playMusic();
}

interface Microphone {

  void amplifyMusic();
}

class BluetoothMic implements BluetoothSpeaker, Microphone {

  @Override
  public void playMusic() {
    System.out.println("노래가 나온다🎸🥁");
  }

  @Override
  public void amplifyMusic() {
    System.out.println("노래를 부른다🎶🎵");

  }
}

