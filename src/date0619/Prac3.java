package date0619;

class A {
  int a;
  int b;
}

public class Prac3 {
  static void func1(A m){
    m.a *= 10;
  }
  static void func2(A m){
    m.a += m.b;
  }
  public static void main(String[] args) {
    A m = new A();
    m.a = 100;
    func1(m); // func1 실행 후 m은 1000일 것이다.
    System.out.println(m.a);
    m.b = m.a; // m.a m.b 둘다 1000 값을 가질 것
    func2(m); // 2000
    System.out.printf("%d", m.a); // 결과 : 2000
  }
}
