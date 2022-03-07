package videos.Tigrani.daseric.lesson19_20_21.atm.common.validator;

import videos.Tigrani.daseric.lesson19_20_21.atm.common.exception.InvalidCardException;

public interface Validator<T> {
     boolean validate(T obj) throws InvalidCardException;
}
