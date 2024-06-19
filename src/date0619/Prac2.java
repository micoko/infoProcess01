package date0619;

public class Prac2 {
  public static void main(String[] args) {

    // 결과 : result1=7

    int a = 3, b = 4, c = 3, d = 5;
    // 0 ^ 1 : XOR 연산 -> 결과 : 1
    if((a == 2 | a == c) & !(c > d)
        & (1 == b ^ c != d)) {
      a = b + c; // a 에 7 초기화
      System.out.println("tmp_a="+a); // a에 어떤값이 초기화되어있는지 확인해보기 -> tmp_a=7
      if(7 == b ^ c != a) {
        // 0 ^ 1 -> if(1) 충족되므로 16번줄 실행
        System.out.println("result1="+a); // a 값인 7을 콘솔에 출력 -> result1=7
      }
      else {
        System.out.println("result2="+b);
      }
    }
    else {
      a = c + d;
      if(7 == c ^ d != a) {
        System.out.println("result3="+a);
      }
      else {
        System.out.println("result4="+d);
      }
    }
  }
}
