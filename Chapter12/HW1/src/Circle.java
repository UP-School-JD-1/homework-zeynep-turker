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
        area = Math.PI * (Math.pow(getRadius(), 2));
        return super.calculateArea();
    }

    @Override
    double calculateCircumference() {
        circumference = 2 * Math.PI * getRadius();
        return super.calculateCircumference();
    }

    @Override
    public int hashCode() {
        return name.hashCode() + getRadius();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        Circle circle = (Circle) obj;
        return getRadius() == circle.getRadius();
    }

    @Override
    public String toString() {
        return "Radius : " + getRadius();
    }
}
