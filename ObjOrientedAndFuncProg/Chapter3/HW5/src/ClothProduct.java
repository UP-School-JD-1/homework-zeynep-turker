public class ClothProduct extends Product {
    private String sex;
    private String size;
    private Location location = null;
    private Price price = null;

    // parametre olarak price gelmez ise ürünün fiyatı olmaz
    public ClothProduct(String sku, String description, Double tax, String sex, String size, String depot, String place) {
        super(sku, description, tax);
        this.sex = sex;
        this.size = size;
        this.location = new Location(depot, place);
    }

    public ClothProduct(String sku, String description, Double tax, String sex, String size, String depot, String place, double price) {
        this(sku, description, tax, sex, size, depot, place);
        this.price = new Price(price);
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    @Override
    public void purchase() {
        System.out.println("Cloth product purchased.");
    }
}
