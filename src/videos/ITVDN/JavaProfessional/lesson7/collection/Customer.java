package videos.ITVDN.JavaProfessional.lesson7.collection;

import java.util.ArrayList;

public class Customer {
    private ArrayList<Account> accounts;

    private String fullName;

    private int customerNumber;

    private static int customerNumberBase = 1000;

    private int numOfAccounts;

    public Customer(String fullName){
        accounts = new ArrayList<>();
        this.fullName = fullName;
        this.customerNumber = customerNumberBase++;
        this.numOfAccounts = 0;
    }

    public Account getAccount(int accNo){
        if (accNo< accounts.size() && numOfAccounts!=0){
            return accounts.get(accNo);
        }
        return null;
    }

/*    @Override
    public String toString(){
        String s = "Customer :" + "fullName=" + fullName + ", customerNumber" +
                customerNumber + ", numOfAccounts" + numOfAccounts;
        for (int i = 0; i < this.numOfAccounts; i++) {
            if (getAccount(i) instanceof SavingAccount){
                s = s + "\n Savings Account with interest rate " + ((SavingAccount)getAccount(i)).getInterestRate() + "%";
            }

        }
        return s;
    }*/

    public void addAccount(Account acc){
        accounts.add(acc);
        numOfAccounts++;
    }
}
















