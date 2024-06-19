package date0619;

public class Prac1 {
  public static void main(String[] args) {
    System.out.print(Prac1.check(1)); // new 생성자 없이 Prac1 클래스의 메서드 check를 호출하려면 -> static 메서드여야 함
  }
  static String check(int num){
    return (num >= 0) ? "positive" : "negative";
  }
}
