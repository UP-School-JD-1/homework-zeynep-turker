/**
 * derleyici 'variable var1 might not have been initialized' hatasını verdi.
 * Çözüm olarak değişkenlere değer atayabiliriz
 */
public class Variables {

    public static void main(String[] args) {
        String var1;
        int var2;
        double var3;
        float var4;

        //System.out.println("var1: " + var1 + " \nvar2: " + var2 + "\nvar3: " + var3 + "\nvar4: " + var4); //HATA

        var1 = "Zeynep Turker";
        var2 = 24;
        var3 = 10.0;
        var4 = 10.0f;

        System.out.println("var1: " + var1 + " \nvar2: " + var2 + "\nvar3: " + var3 + "\nvar4: " + var4);
    }
}
