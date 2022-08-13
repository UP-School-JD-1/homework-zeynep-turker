/***
 * Zeynep Nazire TÜRKER
 */

public class AccountTest {
    public static void main(String[] args) {
        AccountClient accountClient = new AccountClient();
        Account from = new Account();
        Account to = new Account();

        accountClient.withDrawBalance(from, 100.0);
        accountClient.depositBalance(from, 500.0);
        accountClient.depositBalance(to, 100.0);
        accountClient.transfer(to, from, 500.0);
        accountClient.depositBalance(to, 450.0);
        accountClient.transfer(to, from, 500.0);
    }
}
