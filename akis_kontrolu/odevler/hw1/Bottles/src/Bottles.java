/**
 * Ternary ifadesinin kullanımı yanlıştı düzeltildi.
 * main methodu printSong methodu içerisindeydi oradan çıkarıldı ve sınıf içerisine yazıldı.
 * string overloading'leri düzeldi.
 * inputu 8 girmediğin sürece kod sürekli loopta kalıyor ve bu da programın sonsuz kere çalışmasına sebep oluyordu
 * sayıya göre plural değeri 's' veya '' oluyor.
 * çözüm olarak n değerini 1 azalttım ve bu değer 0 olduğunda looptan çıkardım
 *
 */
class Bottles {

    static void printSong(Object stuff, int n) {
        String plural = (n == 1) ? "" : "s";

        Loop:
        while (true) {

            System.out.println(n + " bottle" + plural + " of " + stuff + " on the wall, ");

            System.out.println(n + " bottle" + plural + " of " + stuff + ";");
            System.out.println("You take one down" + "and pass it around:");

            n--; //Eklendi

            plural = (n == 1) ? "" : "s";

            if (n == 0) break Loop; //Looptan çıkış değeri değiştirildi

            System.out.println(n + " bottle" + plural + " of " + stuff + "on the wall !\n ");

            System.out.println("No bottles of " + stuff + " on the wall!");
        }
    }

    public static void main(String[] args) {
        printSong("slime", 8);
    }
}
