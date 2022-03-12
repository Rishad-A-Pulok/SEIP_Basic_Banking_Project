package BankAccount;

public class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount(Double balance,double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String Withdaw(Double amount) {
        if(getBalance() - amount >= 500){
            setBalance(getBalance() - amount);
            return  "Your account has been debited with amount "+amount+". Available balance: "+getBalance();
        }
        return "Insufficient balance!!!";
    }

}
