package SCU.CSEN160.bank.BankBranch;

import SCU.CSEN160.bank.People.Clerk;
import SCU.CSEN160.bank.People.Customer;
import SCU.CSEN160.bank.accounts.Account;

import java.util.ArrayList;
import java.util.Collection;

public class Bank {
    Collection<Customer> customers=new ArrayList<Customer>();
    Collection<Account> accounts=new ArrayList<Account>();
    Collection<Clerk> clerks=new ArrayList<Clerk>();

    public Bank(){
        // Create randomly some accounts
        for (int i=0;i<100;i++){
            if (Math.random()>0.3) {
                this.accounts.add(new SCU.CSEN160.bank.accounts.CheckingAccount());
            } else if (Math.random()>0.6) {
                this.accounts.add(new SCU.CSEN160.bank.accounts.SavingsAccount());
            }else {
                this.accounts.add(new SCU.CSEN160.bank.accounts.PerformanceSavingsAccount());
            }
        }
    }

    public void showAccounts(){
        for(Account a:accounts){
            System.out.println("Account Number: "+a.getAccountNumber()+" | Type: "+a.getAccountType()+" | Balance: "+a.getBalance()+" | Interest Rate: "+a.getInterestRate());
        }
    }

    double showBalance(Customer currentCustomer){
        double total=0;
        for(Account a:accounts){
            /*if(a instanceof SCU.CSEN160.bank.accounts.CheckingAccount){
                if(a).getCustomer().equals(currentCustomer)){
                    total+=a.getBalance();
                }
            }
            else if(a instanceof SCU.CSEN160.bank.accounts.SavingAccount){
                if(((SCU.CSEN160.bank.accounts.SavingAccount) a).getCustomer().equals(currentCustomer)){
                    total+=a.getBalance();
                }
            }
            else if(a instanceof SCU.CSEN160.bank.accounts.LoanAccount){
                if(((SCU.CSEN160.bank.accounts.LoanAccount) a).getCustomer().equals(currentCustomer)){
                    total+=a.getBalance();
                }
            }*/
        }

        return total;
    }
}
