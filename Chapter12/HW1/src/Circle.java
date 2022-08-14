public class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        super("Circle");
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    void draw() {
        System.out.println("Circle is drawing..");
    }

    @Override
    void erase() {
        System.out.println("Circle is erasing..");
    }

    @Override
    double calculateArea() {
        return Math.PI * (Math.pow(getRadius(), 2));
    }

    @Override
    double calculateCircumference() {
        return 2 * Math.PI * getRadius();
    }

    @Override
    public int hashCode() {
        return name.hashCode() + getRadius();
    }

    @Override
    public boolean equals(Object obj) {
        Circle circle = (Circle) obj;
        return getRadius() == circle.getRadius();
    }

    @Override
    public String toString() {
        return "Radius : " + getRadius();
    }
}
