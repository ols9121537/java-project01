import java.util.List;

public class ImplementsList {
   
    public static void main(String[] args) {
        List<Object> myList = new MyList();
        myList.add("Hello");
        myList.add("World");
        System.out.println("My List size: " + myList.size());
    }
}
