import java.util.Objects;

public class Rectangle extends Shape {
    private int edge1, edge2;

    public Rectangle(int edge1, int edge2) {
        super("Rectangle");
        this.edge1 = edge1;
        this.edge2 = edge2;
    }

    public int getEdge1() {
        return edge1;
    }

    public int getEdge2() {
        return edge2;
    }

    @Override
    void draw() {
        System.out.println("Rectangle is drawing..");
    }

    @Override
    void erase() {
        System.out.println("Rectangle is erasing..");
    }

    @Override
    double calculateArea() {
        area = getEdge1() * getEdge2();
        return super.calculateArea();
    }

    @Override
    double calculateCircumference() {
        circumference = 2 * getEdge1() + 2 * getEdge2();
        return super.calculateCircumference();
    }

    @Override
    public int hashCode() {
        return name.hashCode() + Objects.hash(getEdge1(), getEdge2());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        Rectangle rectangle = (Rectangle) obj;
        return getEdge1() == rectangle.getEdge1() && getEdge2() == rectangle.getEdge2();
    }

    @Override
    public String toString() {
        return "Edge 1 : " + getEdge1() + " Edge 2 : " + getEdge2();
    }
}
