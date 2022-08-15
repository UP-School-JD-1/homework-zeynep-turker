public enum BookType {
    ACTION("AKSİYON"), FICTION("KURGU"), NON_FICTION("KURGU DIŞI"), SCINTIFIC("BİLİMSEL"), HORROR("KORKU");

    private String description;

    BookType(final String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
