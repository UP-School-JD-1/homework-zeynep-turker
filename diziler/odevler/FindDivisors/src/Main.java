import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Bölenlerini bulmak istediğiniz sayıyı giriniz: ");
        int number = in.nextInt();
        findDivisors(number);
    }

    private static void findDivisors(int number) {
        System.out.print("Sayının bölenleri: ");
        for (int i=1; i<=number; ++i) {
            if(number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
