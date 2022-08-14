public class ShapeTest {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape square = new Square(5);
        Shape rectangle = new Rectangle(5, 10);
        Shape triangle = new Triangle(5, 5, 5);

        System.out.println("\n********** Draw Shapes **********\n");
        circle.draw();
        square.draw();
        rectangle.draw();
        triangle.draw();

        System.out.println("\n********** Calculate area and circumference **********\n");
        System.out.println("Area of circle (" + circle + ") " + circle.calculateArea());
        System.out.println("Circumference of circle (" + circle + ") " + circle.calculateCircumference());

        System.out.println("Area of square (" + square + ") " + square.calculateArea());
        System.out.println("Circumference of square (" + square + ") " + square.calculateCircumference());

        System.out.println("Area of rectangle (" + rectangle + ") " + rectangle.calculateArea());
        System.out.println("Circumference of rectangle (" + rectangle + ") " + rectangle.calculateCircumference());

        System.out.println("Area of triangle (" + triangle + ") " + triangle.calculateArea());
        System.out.println("Circumference of triangle (" + triangle + ") " + triangle.calculateCircumference());

        System.out.println("\n********** Using equals **********\n");
        Circle differentCircle = new Circle(10);
        System.out.println("Is the same two shape : " + circle.equals(differentCircle));
        System.out.println("First circle hashcode : " + circle.hashCode() + ", Second circle hashcode : " + differentCircle.hashCode() + "\n");

        Circle sameCircle = new Circle(5);
        System.out.println("Is the same two shape : " + circle.equals(sameCircle));
        System.out.println("First circle hashcode : " + circle.hashCode() + ", Second circle hashcode : " + sameCircle.hashCode());

        System.out.println("\n********** Erase Shapes **********\n");
        circle.erase();
        square.erase();
        rectangle.erase();
        triangle.erase();
    }
}
