package videos.Tigrani.daseric.lesson19_20_21.atm;

import videos.Tigrani.daseric.lesson19_20_21.atm.atm.Atm;
import videos.Tigrani.daseric.lesson19_20_21.atm.common.exception.AtmException;
import videos.Tigrani.daseric.lesson19_20_21.atm.common.model.BankCard;
import videos.Tigrani.daseric.lesson19_20_21.atm.common.service.BankAccountService;

public class Test {
    public static void main(String[] args) {
        BankAccountService bag = new BankAccountService();
        Atm atm = new Atm();
        for (BankCard bc : bag.getAllBankCares()) {
            try {
                atm.addCard(bc);
                atm.withdrawMoney(1000);
            } catch (AtmException e) {
                e.printStackTrace();
            }
        }
    }
}
