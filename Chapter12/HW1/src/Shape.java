public class Shape {
    protected String name;

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
        return 0.0;
    }

    double calculateCircumference() {
        return 0.0;
    }
}
