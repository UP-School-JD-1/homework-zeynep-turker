public abstract class Product {
    private String sku;
    private String description;
    private Double tax;

    public Product(String sku, String description, Double tax) {
        this.sku = sku;
        this.description = description;
        this.tax = tax;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public abstract void purchase();
}
