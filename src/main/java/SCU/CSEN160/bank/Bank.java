package SCU.CSEN160.bank;

import SCU.CSEN160.bank.accounts.Account;

import java.util.ArrayList;
import java.util.Collection;

public class Bank {
    Collection<Customer> customers=new ArrayList<Customer>();
    Collection<Account> accounts=new ArrayList<Account>();
    Collection<Clerk> clerks=new ArrayList<Clerk>();
}
