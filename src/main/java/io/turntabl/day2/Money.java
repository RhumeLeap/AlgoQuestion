package io.turntabl.day2;

import io.turntabl.day2.exception.NegativeMoneyException;
import io.turntabl.day2.exception.NoCurrencyConverterException;

import java.util.Objects;

public final class Money {

    private int quantity;
    private String currency;

    public Money(int quantity, String currency) {
        this.quantity = quantity;
        this.currency = currency;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCurrency() {
        return currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return quantity == money.quantity && currency.equals(money.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantity, currency);
    }

    public Money add(Money money1, Money money2) throws NoCurrencyConverterException, NegativeMoneyException {
        if (money1.getCurrency().equals(money2.getCurrency())) {
            if (money1.getQuantity() > 0 || money2.getQuantity() > 0) {
                int totalQuantity = money1.getQuantity() + money2.getQuantity();
                return new Money(totalQuantity, this.currency);
            }
            throw new NegativeMoneyException("At least one quantity is negative");
        }
        throw new NoCurrencyConverterException("You can't add different currency");
    }

    public Money subtract(Money money1, Money money2) throws NoCurrencyConverterException, NegativeMoneyException {
        if (money1.getCurrency().equals(money2.getCurrency())) {
            if (money1.getQuantity() > 0 || money2.getQuantity() > 0) {
                int totalQuantity = Math.abs(money1.getQuantity() - money2.getQuantity());
                return new Money(totalQuantity, this.currency);
            }
            throw new NegativeMoneyException("At least one quantity is negative");
        }
        throw new NoCurrencyConverterException("You can't add different currency");
    }

    public Money multiply(Money money1, Money money2) throws NoCurrencyConverterException, NegativeMoneyException {
        if (money1.getCurrency().equals(money2.getCurrency())) {
            if (money1.getQuantity() > 0 || money2.getQuantity() > 0) {
                int totalQuantity = money1.getQuantity() * money2.getQuantity();
                return new Money(totalQuantity, this.currency);
            }
            throw new NegativeMoneyException("At least one quantity is less than or equal to zero.");
        }
        throw new NoCurrencyConverterException("You can't add different currency");
    }

    /** To be improved upon. */
    public Money divide(Money money1, Money money2) throws NoCurrencyConverterException, NegativeMoneyException {
        if (money1.getCurrency().equals(money2.getCurrency())) {
            if (money1.getQuantity() > 0 || money2.getQuantity() > 0) {
                int totalQuantity = money1.getQuantity() / money2.getQuantity();
                return new Money(totalQuantity, this.currency);
            }
            throw new NegativeMoneyException("At least one quantity is less than or equal to zero.");
        }
        throw new NoCurrencyConverterException("You can't add different currency");
    }


}
