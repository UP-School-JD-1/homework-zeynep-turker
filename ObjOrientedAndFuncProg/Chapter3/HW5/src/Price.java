public class Price implements Priceable {
    private double price;

    public Price(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }
}
