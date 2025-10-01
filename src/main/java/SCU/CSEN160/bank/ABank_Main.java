package SCU.CSEN160.bank;

import SCU.CSEN160.bank.BankBranch.Bank;

public class ABank_Main {
    public static Bank bank = null;

    public static void main(String[] args) {
        ABank_Main.bank=new Bank();
        ABank_Main.bank.showAccounts();
    }
}
