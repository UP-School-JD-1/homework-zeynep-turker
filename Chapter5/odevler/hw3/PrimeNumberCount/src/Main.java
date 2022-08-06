public class Main {

	public static void main(String[] args) {
		findPrimeNumbers(30);
	}

	private static void findPrimeNumbers(int number) {
		int count = 0;
		if (number >= 2)
			for (int i = 2; i <= number; ++i) {
				if (isPrime(i)) count++;
			}

		System.out.println("Count : " + count);
	}

	private static boolean isPrime(int number) {
		boolean isPrime = true;

		if (number <= 1) return false;

		for (int i = 2; i <= Math.sqrt(number); ++i) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		}

		return isPrime;
	}
}
