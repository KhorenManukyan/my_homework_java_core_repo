package videos.Tigrani.daseric.lesson19_20_21.atm.common.model;

import videos.Tigrani.daseric.lesson19_20_21.atm.bank.Bank;

import java.util.Date;

public class BankCard implements Card {
    private String cardHolder;
    private String pan;
    private Date expirationDate;
    private CardType cardType;
    private Bank owner;

    public BankCard(String cardHolder, String pan, Date expirationDate, CardType cardType, Bank owner) {
        this.cardHolder = cardHolder;
        this.pan = pan;
        this.expirationDate = expirationDate;
        this.cardType = cardType;
        this.owner = owner;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public Bank getOwner() {
        return owner;
    }

    public void setOwner(Bank owner) {
        this.owner = owner;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(BankCard obj) {
        return this.pan.equals(obj.getPan());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
