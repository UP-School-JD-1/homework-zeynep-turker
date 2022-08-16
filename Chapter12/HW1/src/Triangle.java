public class Triangle extends Shape {
    private int edge1, edge2, edge3;

    public Triangle(int edge1, int edge2, int edge3) {
        super("Triangle");
        this.edge1 = edge1;
        this.edge2 = edge2;
        this.edge3 = edge3;
    }

    public int getEdge1() {
        return edge1;
    }

    public int getEdge2() {
        return edge2;
    }

    public int getEdge3() {
        return edge3;
    }

    @Override
    void draw() {
        System.out.println("Triangle is drawing..");
    }

    @Override
    void erase() {
        System.out.println("Triangle is erasing..");
    }

    @Override
    double calculateArea() {
        double halfOfCircumference = calculateCircumference() / 2;
        area = Math.sqrt(halfOfCircumference * (halfOfCircumference - getEdge1()) * (halfOfCircumference - getEdge2()) * (halfOfCircumference - getEdge3()));
        return super.calculateArea();
    }

    @Override
    double calculateCircumference() {
        circumference = getEdge1() + getEdge2() + getEdge3();
        return super.calculateCircumference();
    }

    @Override
    public int hashCode() {
        return name.hashCode() + getEdge1() + getEdge2() + getEdge3();
    }

    @Override
    public boolean equals(Object obj) {
        Triangle triangle = (Triangle) obj;
        return getEdge1() == triangle.getEdge1() && getEdge2() == triangle.getEdge2() && getEdge3() == triangle.getEdge3();
    }

    @Override
    public String toString() {
        return "Edge 1 : " + getEdge1() + " Edge 2 : " + getEdge2() + " Edge 3 : " + getEdge3();
    }
}
