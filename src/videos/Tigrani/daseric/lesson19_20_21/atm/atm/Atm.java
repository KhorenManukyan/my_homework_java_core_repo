package videos.Tigrani.daseric.lesson19_20_21.atm.atm;

import videos.Tigrani.daseric.lesson19_20_21.atm.arca.Processing;
import videos.Tigrani.daseric.lesson19_20_21.atm.arca.impl.Arca;
import videos.Tigrani.daseric.lesson19_20_21.atm.common.exception.ArcaException;
import videos.Tigrani.daseric.lesson19_20_21.atm.common.exception.AtmException;
import videos.Tigrani.daseric.lesson19_20_21.atm.common.exception.InvalidCardException;
import videos.Tigrani.daseric.lesson19_20_21.atm.common.model.BankCard;
import videos.Tigrani.daseric.lesson19_20_21.atm.common.validator.Validator;
import videos.Tigrani.daseric.lesson19_20_21.atm.common.validator.impl.CardValidator;

public class Atm {
    private BankCard currentCard;
    private long balance;
    private Validator validator;
    private Processing processingCenter;

    public Atm() {
        this.balance = 5_000_000;
        this.validator = new CardValidator();
        this.processingCenter = new Arca();
    }

    public void addCard(BankCard card) throws AtmException {
        if (currentCard == null) {
            //validate card
            try {
                validator.validate(card);
            } catch (InvalidCardException e) {
                throw new AtmException(e.getMessage());
            }
            //if card is valid
            this.currentCard = card;
            //else   throw new AtmException("invalid card");
        } else {
            throw new AtmException("Atm already has a card");
        }
    }

    public void withdrawMoney(int sum) throws AtmException {
        if (balance >= sum && currentCard != null) {
            // call to arca(currentCard, sum)
            // if ok
            try {
                processingCenter.processTransaction(currentCard,sum);
                balance -= sum;
                currentCard = null;
            } catch (ArcaException e) {
                throw new AtmException(e.getMessage());
            }
        } else {
            throw new AtmException("request denied");
        }
    }

    private void updateBalance(long sum){
        balance += sum;
    }


}




















