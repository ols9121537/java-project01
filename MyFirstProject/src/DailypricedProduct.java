
public class DailypricedProduct extends Product{

    public DailypricedProduct(String name, int price) {
        super.name = name;
        super.price = price;
    }

    @Override
    public int getPrice() {
        // 마감에 대한 기준이 없으니 현재는 항상 50% 할인해 준다.
        return super.price / 2;
}

}