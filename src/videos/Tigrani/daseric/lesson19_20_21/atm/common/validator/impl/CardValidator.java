package videos.Tigrani.daseric.lesson19_20_21.atm.common.validator.impl;

import videos.Tigrani.daseric.lesson19_20_21.atm.common.exception.ExpiredCareException;
import videos.Tigrani.daseric.lesson19_20_21.atm.common.exception.InvalidCardException;
import videos.Tigrani.daseric.lesson19_20_21.atm.common.exception.InvalidCardHolderException;
import videos.Tigrani.daseric.lesson19_20_21.atm.common.exception.InvalidPanException;
import videos.Tigrani.daseric.lesson19_20_21.atm.common.model.BankCard;
import videos.Tigrani.daseric.lesson19_20_21.atm.common.validator.Validator;

import java.util.Date;

import static videos.Tigrani.daseric.lesson19_20_21.atm.common.Constants.PAN_REGEX;

public class CardValidator implements Validator<BankCard> {
    @Override
    public boolean validate(BankCard obj) throws InvalidCardException {
        try {
            validatePan(obj.getPan());
            validateExpirationDate(obj.getExpirationDate());
            validateCardHolder(obj.getCardHolder());
        } catch (InvalidCardException e) {
            e.printStackTrace();
            throw new InvalidCardException(e.getMessage());
        }

        return false;
    }

    private void validateCardHolder(String cardHolder) throws InvalidCardHolderException {

    }

    private void validateExpirationDate(Date expirationDate) throws ExpiredCareException {
    }


    /**
     *
     * @param pan
     * @throws InvalidPanException valid regex ("[0-9]{12,16}")
     */
    private void validatePan(String pan) throws InvalidPanException {
        if (!pan.matches(PAN_REGEX)){
            throw new InvalidPanException("Invalid pan");
        }
    }
}
