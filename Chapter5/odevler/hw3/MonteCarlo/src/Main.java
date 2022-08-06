import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen nokta sayısını giriniz: ");
        int number = input.nextInt();
        calculatePI(number);
    }

    private static void calculatePI(int number) {
        int numberInCircle = 0;

        for (int i = 0; i < number; ++i) {
            double x = Math.random();
            double y = Math.random();

            double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

            if (distance <= 1)
                numberInCircle++;
        }

        double yourPI = 4.0 * numberInCircle / number;

        System.out.println("Your PI : " + yourPI);
        System.out.println("Java's PI : " + Math.PI);
    }
}
