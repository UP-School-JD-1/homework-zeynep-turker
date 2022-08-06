public class Main {

    public static void main(String[] args) {
        playGame(50);
    }

    private static void playGame(int number) {
        for (int i = 1; i <= number; ++i) {
            if (i % 15 == 0) System.out.println("Fizz Buzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else if (i % 5 == 0)
                System.out.println("Buzz");
            else System.out.println(i + " ");
        }
    }
}
