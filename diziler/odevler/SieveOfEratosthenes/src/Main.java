public class Main {
    public static void main(String[] args) {
        findPrimeNumbers(50);
    }

    private static void findPrimeNumbers(int n) {
        int[] array = new int[n + 1];
        int k = 0;
        for (int i = 0; i < n + 1; ++i) {
            array[k++] = i;
        }
        for (int i = 2; i <= Math.sqrt(n); ++i) {
            if (array[i] != 0) {
                for (int j = (int) Math.pow(i, 2); j <= n; j += i) {
                    array[j] = 0;
                }
            }
        }
        System.out.println(n + " sayısına kadar olan asal sayılar: ");
        for (int i = 0; i < n + 1; i++) {
            if (i != 0 && i != 1 && array[i] != 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
