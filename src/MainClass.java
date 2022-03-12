import BankAccount.CheckingAccount;
import BankAccount.SavingsAccount;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Bank Account Details: ");
        final SavingsAccount sa = new SavingsAccount(500.0,5.6);
        final CheckingAccount ca = new CheckingAccount(5000.0,50000.0);
        System.out.println("================");
        System.out.println("deposit");
        System.out.println("---------");
        System.out.println(sa.Deposit(1000.0));
        ca.Deposit(2000.0);
        System.out.println("Withdraw");
        System.out.println("---------");
        System.out.println(sa.Withdaw(200.0));
        System.out.println(ca.Withdaw(400.0));
        System.out.println(sa.Withdaw(1000.0));
        System.out.println(ca.Withdaw(60000.0));
    }
}
