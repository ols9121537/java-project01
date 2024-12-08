
public class FixedPricedProduct extends Product{

    public FixedPricedProduct(String name, int price) {
        super.name = name;
        super.price = price;
    }
    @Override
    public int getPrice() {
        return super.price;
    }
    }
