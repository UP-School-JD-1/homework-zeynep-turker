public class Location implements Locatable {
    private String depot;
    private String place;

    public Location(String depot, String place) {
        this.depot = depot;
        this.place = place;
    }

    @Override
    public String getDepot() {
        return this.depot;
    }

    @Override
    public void setDepot(String depot) {
        this.depot = depot;
    }

    @Override
    public String getPlace() {
        return this.place;
    }

    @Override
    public void setPlace(String place) {
        this.place = place;
    }
}
