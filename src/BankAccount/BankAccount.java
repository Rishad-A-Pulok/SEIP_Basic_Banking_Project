package BankAccount;

public abstract class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String Deposit(Double amount) {
        balance += amount;
        return "Your account has been credited with amount "+amount+". Available balance:  "+balance;
    }
    public abstract String Withdaw(Double amount);

}
