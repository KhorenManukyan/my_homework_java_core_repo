package videos.Tigrani.daseric.lesson19_20_21.atm.arca.impl;

import videos.Tigrani.daseric.lesson19_20_21.atm.arca.Processing;
import videos.Tigrani.daseric.lesson19_20_21.atm.common.exception.ArcaException;
import videos.Tigrani.daseric.lesson19_20_21.atm.common.exception.BankException;
import videos.Tigrani.daseric.lesson19_20_21.atm.common.exception.InvalidCardException;
import videos.Tigrani.daseric.lesson19_20_21.atm.common.model.BankCard;
import videos.Tigrani.daseric.lesson19_20_21.atm.common.validator.Validator;
import videos.Tigrani.daseric.lesson19_20_21.atm.common.validator.impl.CardValidator;

public class Arca implements Processing<BankCard> {
    private Validator validator;

    public Arca() {
        this.validator = new CardValidator();
    }

    @Override
    public void processTransaction(BankCard card, int sum) throws ArcaException {
        try {
            validator.validate(card);
            card.getOwner().processTransactionBank(card, sum);
        } catch (InvalidCardException | BankException e) {
            e.printStackTrace();
            throw new ArcaException(e.getMessage());
        }

    }
}
