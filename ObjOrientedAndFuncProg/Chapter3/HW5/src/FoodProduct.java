import java.util.Date;

public class FoodProduct extends Product {
    private Date productionDate;
    private int life;
    private Location location = null;
    private Price price = null;

    // parametre olarak price gelmez ise ürünün fiyatı olmaz
    public FoodProduct(String sku, String description, Double tax, Date productionDate, int life, String depot, String place) {
        super(sku, description, tax);
        this.location = new Location(depot, place);
        this.productionDate = productionDate;
        this.life = life;
    }

    public FoodProduct(String sku, String description, Double tax, Date productionDate, int life, String depot, String place, double price) {
        this(sku, description, tax, productionDate, life, depot, place);
        this.price = new Price(price);
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
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
        System.out.println("Food product purchased.");
    }
}
