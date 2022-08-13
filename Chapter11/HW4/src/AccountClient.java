public class AccountClient {
    private static double depositCost = 5; // Havale masrafı

    /**
     * gelen account nesnesini bakiyesi çekilecek miktar kadar azaltılır
     * girilen para miktarı, hesaptaki para miktarından büyükse gerekli uyarı verilir
     *
     * @param account para çekilecek hesap
     * @param amount  çekilecek para miktarı
     */
    public void withDrawBalance(Account account, double amount) {
        System.out.println("------------------------------------------");
        System.out.println("********** Para Çekme İşlemi **********");
        if (amount > account.getBalance()) {
            System.out.println("Lütfen bakiyenizden fazla bir miktar girmeyiniz..");
            return;
        }
        printInfo(account);
        account.setBalance(account.getBalance() - amount);
        System.out.println("Çekilecek miktar: " + amount);
        System.out.println("Başarılı bir şekilde para çekildi..");
        printInfo(account);
        System.out.println("------------------------------------------");
    }

    /**
     * gelen account nesnesinin bakiyesi girilen para miktarı kadar arttırılır
     *
     * @param account para yatırılacak hesap
     * @param amount  yatırılacak para miktarı
     */
    public void depositBalance(Account account, double amount) {
        System.out.println("------------------------------------------");
        System.out.println("********** Para Yatırma İşlemi **********");
        if (amount < 0) {
            System.out.println("Lütfen 0 dan büyük bir miktar giriniz..");
            return;
        }
        printInfo(account);
        account.setBalance(account.getBalance() + amount);
        System.out.println("Yatırılacak miktar: " + amount);
        System.out.println("Başarılı bir şekilde hesabınıza para yatırıldı..");
        printInfo(account);
        System.out.println("------------------------------------------");
    }

    /**
     * eğer gönderilecek miktar ve havale masrafı, from nesnesinin bakiyesinden büyükse havale işlemi gerçekleşmez
     * ve gerekli uyarı verilir
     * aksi taktirde from nesnesinin bakiyesi, gönderilecek para miktarı ve havale masrafı kadar azaltılır
     * to nesnesinin bakiyesi de gönderilen para miktarı kadar arttırılır
     *
     * @param from   havale yapılan account
     * @param to     para gönderilecek olan account
     * @param amount gönderilecek para miktarı
     */
    public void transfer(Account from, Account to, double amount) {
        System.out.println("------------------------------------------");
        System.out.println("********** Para Havale Etme İşlemi **********");
        if (from.getBalance() < (amount + depositCost)) {
            printInfo(from);
            System.out.println("Havale yapılmak istenen miktar: " + amount);
            System.out.println("Havale yapabilmek için yeterli paraya sahip değilsiniz..");
            return;
        }
        printInfo(from);
        from.setBalance(from.getBalance() - (amount + depositCost));
        System.out.println("Havale yapılan hesabın eski bakiyesi: " + to.getBalance());
        to.setBalance(to.getBalance() + amount);
        System.out.println("Havale masrafı: " + depositCost);
        System.out.println("Havale edilen miktar: " + amount);
        System.out.println("Havale işlemi başarılı bir şekilde gerçekleştirildi..");
        printInfo(from);
        System.out.println("Havale yapılan hesabın güncel bakiyesi: " + to.getBalance());
        System.out.println("------------------------------------------");
    }

    public void printInfo(Account account) {
        System.out.println("Bakiyeniz: " + account.getBalance());
    }
}
