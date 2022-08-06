/**
 * Bolum 4 - Odev 3
 * block içinde oluşturulan değişken blok dışında kullanılmaya çalıştığında compiler şu hatayı verir
 * java: cannot find symbol
 * symbol:   variable name
 * location: class Main
 * <p>
 * Hatanın sebebi değişkenin sadece blok içinde hafızada yer almasıdır. Blok dışındayken değişken silinir
 * <p>
 * Çözüm olarak değişkeni main methodunun üstünde tanımlayıp değer atamayı blok içinde yapabiliriz
 */
public class Main {

    public static void main(String[] args) {
        String name = "Zeynep";
        String surname;

        {
            surname = "Turker";
        }

        System.out.println(name + " " + surname);
    }
}
