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
        area = Math.pow(getEdge(), 2);
        return super.calculateArea();
    }

    @Override
    double calculateCircumference() {
        circumference = 4 * getEdge();
        return super.calculateCircumference();
    }

    @Override
    public int hashCode() {
        return name.hashCode() + getEdge();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        Square square = (Square) obj;
        return getEdge() == square.getEdge();
    }

    @Override
    public String toString() {
        return "Edge : " + getEdge();
    }
}
