/***
 * Zeynep Nazire TÜRKER
 */

public class PointTest {
    public static void main(String[] args) {
        Point point1 = new Point(3, 4);
        Point point2 = new Point(8, 10);
        Point point3 = new Point();
        Point point4 = new Point(3);

        System.out.println("\n//////////////////////////\n");

        double distanceToOrijin1 = point1.findDistanceToOrijin();
        double distanceToOrijin2 = point2.findDistanceToOrijin();
        double distanceToOrijin3 = point3.findDistanceToOrijin();
        double distanceToOrijin4 = point4.findDistanceToOrijin();

        System.out.println(point1.printPoint() + " noktasının orijine uzaklığı: " + distanceToOrijin1);
        System.out.println(point2.printPoint() + " noktasının orijine uzaklığı:  " + distanceToOrijin2);
        System.out.println(point3.printPoint() + " noktasının orijine uzaklığı:  " + distanceToOrijin3);
        System.out.println(point4.printPoint() + " noktasının orijine uzaklığı:  " + distanceToOrijin4);

        System.out.println("\n//////////////////////////\n");

        double distanceToPoint1 = point1.findDistanceToPoint(point2);
        System.out.println(point1.printPoint() + "'nin " + point2.printPoint() + "'ye uzaklığı: " + distanceToPoint1);
        double distanceToPoint2 = point3.findDistanceToPoint(point4);
        System.out.println(point3.printPoint() + "'nin " + point4.printPoint() + "'ye uzaklığı: " + distanceToPoint2);
        double distanceToPoint3 = point4.findDistanceToPoint(point2);
        System.out.println(point4.printPoint() + "'nin " + point2.printPoint() + "'ye uzaklığı: " + distanceToPoint3);
        double distanceToPoint4 = point2.findDistanceToPoint(point3);
        System.out.println(point2.printPoint() + "'nin " + point3.printPoint() + "'ye uzaklığı: " + distanceToPoint4);

        System.out.println("\n//////////////////////////\n");

        System.out.println("Point3 " + point3.printPoint() + ", Point2 " + point2.printPoint() + "'in  klonu oldu.");
        point3 = point2.clone();
        System.out.println("Point3'ün yeni değerleri: " + point3.printPoint() + "\n");

        System.out.println("Point2 " + point2.printPoint() + ", Point1 " + point1.printPoint() + "'in  klonu oldu.");
        point2 = point1.clone();
        System.out.println("Point2'nin yeni değerleri: " + point2.printPoint() + "\n ");

        System.out.println("Point4 " + point4.printPoint() + ", Point1 " + point1.printPoint() + "'in  klonu oldu.");
        point4 = point1.clone();
        System.out.println("Point4'ün yeni değerleri: " + point4.printPoint() + "\n");

        System.out.println("Point1 " + point1.printPoint() + ", Point3 " + point3.printPoint() + "'in  klonu oldu.");
        point1 = point3.clone();
        System.out.println("Yeni değerleri: " + point1.printPoint() + "\n");

        System.out.println("\n//////////////////////////\n");

        System.out.print("Point1 " + point1.printPoint() + " hareket ettirildi. (x+=5, y+=7) ");
        point1.move('x', 5);
        point1.move('y', 7);
        System.out.println("Yeni değerleri: " + point1.printPoint() + "\n");

        System.out.print("Point2 " + point2.printPoint() + " hareket ettirildi. (x+=12, y+=6) ");
        point2.move('x', 12);
        point2.move('y', 6);
        System.out.println("Yeni değerleri: " + point2.printPoint() + "\n");

        System.out.print("Point3 " + point3.printPoint() + " hareket ettirildi. (x+=7, y+=9) ");
        point3.move('x', 7);
        point3.move('y', 9);
        System.out.println("Yeni değerleri: " + point3.printPoint() + "\n");

        System.out.print("Point4 " + point4.printPoint() + " hareket ettirildi. (x+=11, y+=5) ");
        point4.move('x', 11);
        point4.move('y', 5);
        System.out.println("Yeni değerleri: " + point4.printPoint() + "\n");
    }
}
