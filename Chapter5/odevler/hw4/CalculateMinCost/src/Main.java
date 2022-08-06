public class Main {
    static double minCost = 0.0;

    public static void main(String[] args) {
        System.out.println("for ile cost : " + fiyatHesapla(155));
        özyinelemeliFiyatHesaplama(155);
        System.out.println("recursive ile cost : " + minCost);
    }

    private static double fiyatHesapla(int n) {
        double cost25 = 1.0;
        double cost12 = 0.50;
        double cost1 = 0.05;

        double minCost = 0.0;

        int num25 = n / 25;

        if (num25 > 0) {
            minCost += num25 * cost25;
            n -= num25 * 25;
        }

        int num12 = n / 12;
        if (num12 > 0) {
            minCost += num12 * cost12;
            n -= num12 * 12;
        }

        if (n > 0) {
            minCost += n * cost1;
        }
        return minCost;
    }

    public static void özyinelemeliFiyatHesaplama(int n) {
        double cost25 = 1.0;
        double cost12 = 0.50;
        double cost1 = 0.05;
        int num25 = n / 25;
        int num12 = n / 12;

        if (num25 > 0) {
            minCost += num25 * cost25;
            n -= num25 * 25;
            özyinelemeliFiyatHesaplama(n);
        } else if (num12 > 0) {
            minCost += num12 * cost12;
            n -= num12 * 12;
            özyinelemeliFiyatHesaplama(n);
        } else
            minCost += n * cost1;
    }
}
