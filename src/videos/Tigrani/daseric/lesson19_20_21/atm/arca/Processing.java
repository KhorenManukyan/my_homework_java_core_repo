package videos.Tigrani.daseric.lesson19_20_21.atm.arca;

import videos.Tigrani.daseric.lesson19_20_21.atm.common.exception.ArcaException;
import videos.Tigrani.daseric.lesson19_20_21.atm.common.model.BankCard;

public interface Processing<T extends BankCard> {
    void processTransaction(T card, int sum) throws ArcaException;
}
