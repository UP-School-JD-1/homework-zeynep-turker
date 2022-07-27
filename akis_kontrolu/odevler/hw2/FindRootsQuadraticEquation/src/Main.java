import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		findRoots();
	}

	private static void findRoots() {
		Scanner input = new Scanner(System.in);
		System.out.println("Find roots of ax^2+bx+c");

		System.out.println("Enter a : ");
		int a = input.nextInt();

		System.out.println("Enter b : ");
		int b = input.nextInt();

		System.out.println("Enter c : ");
		int c = input.nextInt();

		double delta = Math.pow(b, 2) - 4 * a * c;

		if (delta > 0) {
			double firstRoot, secondRoot;

			firstRoot = (-b + Math.sqrt(delta)) / (2 * a);
			System.out.println("First Root of Equation: " + firstRoot);

			secondRoot = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("Second Root of Equation: " + secondRoot);
		} else if (delta == 0) {
			double root;
			root = (-1 * (double) (b / (2 * a)));
			System.out.println("Root: " + root);
		} else {
			System.out.println("Equation has no real roots");
		}
	}
}
