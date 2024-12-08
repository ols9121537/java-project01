import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Shopping {
    

    // private static List<Order> orderList;  // List 인터페이스로 선언
    private static Map<Integer, Order> orderMap;
    private static int orderNumber = 0;

    public static void main(String[] args) {

        // ArrayList로 초기화 -> list는 class생성못함 ArrayList는 클래스
        // orderList = new ArrayList<Order>();
        orderMap = new HashMap<Integer, Order>();

        order(new Customer("안영희", "01012345678", null), 
        new FixedPricedProduct("켄트 백의 Tidy First", 19800));
       
        order(new Customer("안영희", null, "david@company.com"),
        new FixedPricedProduct("켄트 백의 Tidy First", 19800));

        order(new Customer(null, "01012345678", "david@company.com"),
        new FixedPricedProduct("켄트 백의 Tidy First", 19800));
        // 마감 임박 식품
        order(new Customer(null, "01012345678", "david@company.com"),
        new DailypricedProduct("떡 1팩", 6000));
        //System.out.println(orderList.size());
        System.out.println("주문개수:" + orderMap.size());
    }

    private static void order(Customer customer, Product product) {
      Order newOrder = new Order(customer, product);  
      orderMap.put(++orderNumber, newOrder);                                     
      System.out.println(newOrder.toString());

    } 

    private static void order(Customer customer, String ProductName, int price) {
      // Order List에 담기
      Order newOrder = new Order(customer, ProductName, price);     // 파라미터를 받아 객체 생성
      orderMap.put(++orderNumber, newOrder);
      // orderList.add(newOrder);                                      // list에 넣고
      System.out.println(newOrder.toString());                      // 내용을 보기 좋게 출력
    } 
    
}
