public class ComputerProcess {
    // Product değil ve price a sahip
    private Price price;

    public ComputerProcess(double price) {
        this.price = new Price(price);
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }
}
