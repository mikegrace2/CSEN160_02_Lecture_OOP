package SCU.CSEN160.bank.accounts;

public interface Account {
    public double getBalance();
    public void deposit(double amount);
    public void withdraw(double amount);
    public String getAccountNumber();
    public double getInterestRate();
    public double calculateInterest(int months);
    public String getAccountType();
}