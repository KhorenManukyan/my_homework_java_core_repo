package videos.Tigrani.daseric.lesson19_20_21.atm.common.service;

import videos.Tigrani.daseric.lesson19_20_21.atm.bank.Account;
import videos.Tigrani.daseric.lesson19_20_21.atm.bank.Bank;
import videos.Tigrani.daseric.lesson19_20_21.atm.common.model.BankCard;

import java.util.Map;
import java.util.Set;

public class BankAccountService {
    private Map<Bank, Map<BankCard, Account>> x;
    public Map<BankCard, Account> getCardAccountMap(Bank bank){
        return x.get(bank);
    }

    public Set<BankCard> getAllBankCares(){
        return null;
    }
}
