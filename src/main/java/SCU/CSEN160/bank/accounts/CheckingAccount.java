package SCU.CSEN160.bank.accounts;

public class CheckingAccount implements Account {
    private String accountNumber;
    private double balance;
    private double interestRate=0.1;

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
        return "Checking Account";
    }
}
