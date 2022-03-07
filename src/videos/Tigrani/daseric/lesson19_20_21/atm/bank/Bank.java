package videos.Tigrani.daseric.lesson19_20_21.atm.bank;

import videos.Tigrani.daseric.lesson19_20_21.atm.common.exception.BankException;
import videos.Tigrani.daseric.lesson19_20_21.atm.common.exception.InvalidCardException;
import videos.Tigrani.daseric.lesson19_20_21.atm.common.model.BankCard;
import videos.Tigrani.daseric.lesson19_20_21.atm.common.validator.Validator;
import videos.Tigrani.daseric.lesson19_20_21.atm.common.validator.impl.CardValidator;

/* Bank@ piti unena accountneri list, amen accountin kcvac
e gone mi card, accountnel uni ir ballanc@
*/
public enum Bank {
    HSBC {
        @Override
        public boolean processTransactionBank(BankCard bankCard, int sum) throws BankException{
            if (bankCard.getOwner().equals(this)) {
                try {
                    getValidator().validate(bankCard);
                } catch (InvalidCardException e) {
                    throw new BankException(e.getMessage());
                }
            }
            return false;
        }

        @Override
        public Account getCardAccount(BankCard bankCard) {
            return null;
        }
    },
    ACBA {
        @Override
        public boolean processTransactionBank(BankCard bankCard, int sum) throws BankException {
            if (bankCard.getOwner().equals(this)) {
                try {
                    getValidator().validate(bankCard);
                } catch (InvalidCardException e) {
                    throw new BankException(e.getMessage());
                }
            }
            return false;
        }

        @Override
        public Account getCardAccount(BankCard bankCard) {
            return null;
        }
    },
    ABB {
        @Override
        public boolean processTransactionBank(BankCard bankCard, int sum) throws BankException {
            if (bankCard.getOwner().equals(this)) {
                try {
                    getValidator().validate(bankCard);
                } catch (InvalidCardException e) {
                    throw new BankException(e.getMessage());
                }
            }
            return false;
        }

        @Override
        public Account getCardAccount(BankCard bankCard) {
            return null;
        }
    },
    ID {
        @Override
        public boolean processTransactionBank(BankCard bankCard, int sum) throws BankException {
            if (bankCard.getOwner().equals(this)) {
                try {
                    getValidator().validate(bankCard);
                } catch (InvalidCardException e) {
                    throw new BankException(e.getMessage());
                }
            }
            return false;
        }

        @Override
        public Account getCardAccount(BankCard bankCard) {
            return null;
        }
    };

    private CardValidator validator;

    Bank() {
        this.validator = new CardValidator();
    }

    public Validator getValidator() {
        return validator;
    }

    public abstract boolean processTransactionBank(BankCard bankcard, int sum) throws BankException;

    public abstract Account getCardAccount(BankCard bankCard);
}
