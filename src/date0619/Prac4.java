package date0619;

class Car implements Runnable{
  int a;

  @Override
  public void run(){
    System.out.println("run"); // Car 클래스에서 Runnable 인터페이스의 run()을 재정의 한 것
  }
  public void run2(){
    System.out.println("이것도 실행됩니까?"); // 실행되지 않음 이유 : 스레드의 .start 는 Runnable 인터페이스의 run() 메소드를 호출하기 때문
  }
}

public class Prac4 {
  public static void main(String[] args) {
    Thread t1 = new Thread(new Car());
    t1.start(); // t1 객체의 run() 메소드를 호출5
  }
}
