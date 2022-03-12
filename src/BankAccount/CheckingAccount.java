package BankAccount;

public class CheckingAccount extends BankAccount {
    private double limit;

    public CheckingAccount(double balance,double limit) {
        super(balance);
        this.limit = limit;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    @Override
    public String Withdaw(Double amount) {
        if(amount <= limit){
            setBalance(getBalance() - amount);
            return  "Your account has been debited with amount "+amount+". Available balance: "+getBalance();
        }
        return "Limit exceeds!!!";
    }
}
