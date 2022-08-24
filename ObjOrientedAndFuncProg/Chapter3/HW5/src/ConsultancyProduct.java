public class ConsultancyProduct extends Product {
    // Location'u yok
    private Price price = null;

    // parametre olarak price gelmez ise ürünün fiyatı olmaz
    public ConsultancyProduct(String sku, String description, Double tax) {
        super(sku, description, tax);
    }

    public ConsultancyProduct(String sku, String description, Double tax, double price) {
        this(sku, description, tax);
        this.price = new Price(price);
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    @Override
    public void purchase() {
        System.out.println("Consultancy product purchased.");
    }
}
