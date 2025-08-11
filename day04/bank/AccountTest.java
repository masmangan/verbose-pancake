package bank;

public class AccountTest {

    public static void main(String[] args) {

        Account account1 = new Account("Jane Green", 50.0);
        Account account2 = new Account("John Blue", 7.33);

        displayAccount(account1);
        displayAccount(account2);

        account1.deposit(100);
        account2.deposit(500);

        displayAccount(account1);
        displayAccount(account2);
    }   

    private static void displayAccount(Account account) {
        System.out.printf("%n%-20s R$ %10.2f%n", account.getName(), account.getBalance());
    }

}
