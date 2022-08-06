import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz: ");
        int number = scanner.nextInt();
        System.out.println(number + " asal mı : " + isPrime(number));
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
