package SCU.CSEN160.bank.accounts;

public class SavingsAccount implements Account {
    private String accountNumber;
    private double balance;
    private double interestRate=1.0;

    @Override
    public double getBalance() {
        return 0;
    }

    @Override
    public void deposit(double amount) {

    }

    @Override
    public void withdraw(double amount) {

    }

    @Override
    public String getAccountNumber() {
        return "";
    }

    @Override
    public double getInterestRate() {
        return this.interestRate;
    }

    @Override
    public double calculateInterest(int months) {
        return 0;
    }

    @Override
    public String getAccountType() {
        return "Savings Account";
    }
}
