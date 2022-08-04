public class PointTest {
	public static void main(String[] args) {
		Point point1 = new Point(3,4);
		Point point2 = new Point(8, 10);

		System.out.println("Point1 oluşturuldu. X: " + point1.getX() + " Y: " + point1.getY());
		System.out.println("Point2 oluşturuldu. X: " + point2.getX() + " Y: " + point2.getY());

		double distanceToOrijin1 = point1.findDistanceToOrijin();
		double distanceToOrijin2 = point2.findDistanceToOrijin();

		System.out.println("Point1'in orijine uzaklığı: " + distanceToOrijin1);
		System.out.println("Point2'nin orijine uzaklığı: " + distanceToOrijin2);

		double distanceToPoint = point1.findDistanceToPoint(point2);
		System.out.println("Point1'in point2'ye uzaklığı: " + distanceToPoint);

		point2 = point1.clone();
		System.out.println("Point2, point1'in klonu oldu. Yeni değerleri: X=" + point2.getX() + " Y=" + point1.getY());

		point1.move('x', 5);
		point1.move('y', 7);
		System.out.println("Point1 hareket ettirildi. Yeni değerleri: X="+ point1.getX() + " Y=" + point1.getY());
	}
}
