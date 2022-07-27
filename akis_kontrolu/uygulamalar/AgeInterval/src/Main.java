import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Yasınızı giriniz: ");
        int age = sc.nextInt();
        findInterval(age);
        Integer[] ages = {15, 25, 26, 2, 55, 78};
        System.out.println("Yas Aralığı: " + Arrays.toString(ages));
        findFamilyAgeInterval(ages);
        findAgeIntervalCount(ages);
    }

    static void findInterval(Integer age) {
        if (age < 0 || age > 120) return;
        else if (age >= 0 && age <= 3)
            System.out.println("Bebek");
        else if (age >= 4 && age <= 12)
            System.out.println("Çocuk");
        else if (age >= 13 && age <= 19)
            System.out.println("Ergen");
        else if (age >= 20 && age <= 30)
            System.out.println("Genç");
        else if (age >= 31 && age <= 59)
            System.out.println("Orta Yaş");
        else if (age >= 60 && age <= 120)
            System.out.println("Yaşlı");
    }

    static void findFamilyAgeInterval(Integer[] ages) {
        Integer min, max;
        min = Collections.min(Arrays.asList(ages));
        max = Collections.max(Arrays.asList(ages));
        System.out.println("Yas Aralığı: " + min + "-" + max);
    }

    static void findAgeIntervalCount(Integer[] ages) {
        int baby = 0, child = 0, teenager = 0, youth = 0, middleAged = 0, old = 0;
        for (int age : ages) {
            if (age >= 0 && age <= 3)
                baby++;
            else if (age >= 4 && age <= 12)
                child++;
            else if (age >= 13 && age <= 19)
                teenager++;
            else if (age >= 20 && age <= 30)
                youth++;
            else if (age >= 31 && age <= 59)
                middleAged++;
            else if (age >= 60 && age <= 120)
                old++;
        }
        if (baby > 0) {
            System.out.println("0-3 aralığında " + baby + " tane kişi vardır");
        }
        if (child > 0) {
            System.out.println("4-12 aralığında " + child + " tane kişi vardır");
        }
        if (teenager > 0) {
            System.out.println("13-19 aralığında " + teenager + " tane kişi vardır");
        }
        if (youth > 0) {
            System.out.println("20-30 aralığında " + youth + " tane kişi vardır");
        }
        if (middleAged > 0) {
            System.out.println("31-59 aralığında " + middleAged + " tane kişi vardır");
        }
        if (old > 0) {
            System.out.println("60-120 aralığında " + old + " tane kişi vardır");
        }
    }
}
