public class Main {

    public static void main(String[] args) {
        calculateFibonacciWithFor(20);
        calculateFibonacciWithRecursive(20, 0, 1);
    }

    static void calculateFibonacciWithFor(int count) {
        int start = 0, end = 1;

        System.out.print(start + " " + end);
        for (int i = 0; i < count - 2; ++i) {
            int temp = end;
            end = start + end;
            start = temp;
            System.out.print(" " + end);
        }
        System.out.println();
    }

    static void calculateFibonacciWithRecursive(int count, int start, int end) {
        if (count == 1) return;

        if (start == 0) System.out.print(start);

        System.out.print(" " + end);

        int temp = end;
        end = end + start;
        start = temp;

        calculateFibonacciWithRecursive(--count, start, end);
    }
}
