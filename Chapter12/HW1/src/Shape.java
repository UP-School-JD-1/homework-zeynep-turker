public class Shape {
    protected String name;
    protected double circumference;
    protected double area;

    public Shape(String name) {
        this.name = name;
    }

    void draw() {
        System.out.println("Shape is drawing..");
    }

    void erase() {
        System.out.println("Shape is erasing..");
    }

    double calculateArea() {
        return area;
    }

    double calculateCircumference() {
        return circumference;
    }
}
