public class Square extends Shape {
    private int edge;

    public Square(int edge) {
        super("Square");
        this.edge = edge;
    }

    public int getEdge() {
        return edge;
    }

    @Override
    void draw() {
        System.out.println("Square is drawing..");
    }

    @Override
    void erase() {
        System.out.println("Square is erasing..");
    }

    @Override
    double calculateArea() {
        return Math.pow(getEdge(), 2);
    }

    @Override
    double calculateCircumference() {
        return 4 * getEdge();
    }

    @Override
    public int hashCode() {
        return name.hashCode() + getEdge();
    }

    @Override
    public boolean equals(Object obj) {
        Square square = (Square) obj;
        return getEdge() == ((Square) obj).getEdge();
    }

    @Override
    public String toString() {
        return "Edge : " + getEdge();
    }
}
