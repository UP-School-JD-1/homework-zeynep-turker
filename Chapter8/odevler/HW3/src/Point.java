public class Point {
	int x;
	int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double findDistanceToOrijin() {
		double distance;
		distance = Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(), 2));
		return distance;
	}

	public double findDistanceToPoint(Point point) {
		double distance;
		distance = Math.sqrt(Math.pow((getX() - point.getX()), 2) + Math.pow((getY() - point.getY()), 2));

		return distance;
	}

	public Point clone() {
		return new Point(getX(), getY());
	}

	public void move(char direction, int number) {
		if (direction == 'x')
			this.x += number;
		else if (direction == 'y')
			this.y += number;
		else
			System.out.println("Yanlış yön girdiniz. Lütfen 'x' veya 'y' şeklinde giriniz.");
	}
}
