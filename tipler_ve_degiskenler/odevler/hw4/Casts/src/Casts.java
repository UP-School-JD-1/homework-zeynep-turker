/**
 * Bolum 4 - Odev 4
 * Daraltan çevirimleri cast operatoru olmadan yazarsak asagıdaki hatayı alırız (floatVar = doubleVar;)
 * java: incompatible types: possible lossy conversion from double to float
 */
public class Casts {

    public static void main(String[] args) {
        int intVar = 5;
        double doubleVar = 8.0;
        float floatVar = 10.0f;
        long longVar = 1000;
        short shortVar = 3;

        System.out.println("-Long var: " + longVar + " Int var: " + intVar);
        longVar = intVar; //Genişleten Çevirim
        System.out.println("+Long var: " + longVar);

        System.out.println("-Short var: " + shortVar + " Double var: " + doubleVar);
        shortVar = (short) doubleVar; //Daraltan Çevirim
        System.out.println("+Short var: " + shortVar);

        System.out.println("-Double var: " + doubleVar + " Long var: " + longVar);
        doubleVar = longVar; //Genişleten Çevirim
        System.out.println("+Double var: " + doubleVar);

        System.out.println("-Float var: " + floatVar + " Double var: " + doubleVar);
        floatVar = (float) doubleVar; //Daraltan Çevirim
        System.out.println("+Float var: " + floatVar);

        System.out.println("-Int var: " + intVar + " Double var: " + doubleVar);
        intVar = (int) doubleVar; //Daraltan Çevirim
        System.out.println("+Int var: " + intVar);
    }
}
