public class App {
    public static void main(String[] args) throws Exception {
        var message = "Hello";      // 원래는 변수 선언을 해야 하지만 type 추론도 가능함
        System.out.println(message);
    }
}
