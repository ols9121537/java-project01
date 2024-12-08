public class App2 {
   public static void main(String[] args) {
      // 변수와 초기화
      String message = "Hello, World!";
      System.out.println(message);
      System.out.println("Hello, World!");

      // 산술 연산자
      System.out.println(1 + 1);
      System.out.println(1 - 1);
      System.out.println(2 * 2);
      System.out.println(4 / 2);
      System.out.println(4 % 2);

      // 비교 연산자
      System.out.println(4 > 2);
      System.out.println(4 == 2);
      System.out.println(4 != 2); // not (같지 않다)

      // 논리 연산자
      System.out.println(true && false);
      System.out.println(true || false);

      // 증감 연산자
      int i = 0;
      System.out.println(i++);
      System.out.println(i);
      System.out.println(++i);
      System.out.println(i);
      // int 형
      System.out.println("가장 작은 int:" + Integer.MIN_VALUE);
      System.out.println("가장 작은 int:" + Integer.MAX_VALUE);
      System.out.println(i);

      // long 형
      System.out.println("long i =" + (long)i);
      System.out.println("가장 작은 long : " + Long.MIN_VALUE);
      System.out.println("가장 큰 long: " + Long.MAX_VALUE);

      // double 형
      System.out.println((double)i);
      System.out.println(" 가장 작은 double : " + Double.MIN_VALUE);
      System.out.println(" 가장 큰 double : " + Double.MAX_VALUE);
      System.out.println(" 가장 작은 지수 : " + Double.MIN_EXPONENT);
      System.out.println(" 가장 큰 지수 : " + Double.MAX_EXPONENT);

      // char
      char ch = 'c';         // 한 글자로만 저장 가능 ex) a,b,c 가,츄,양
      System.out.println(ch);
   }
}
