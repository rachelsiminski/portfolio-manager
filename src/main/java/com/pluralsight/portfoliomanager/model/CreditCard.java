package com.pluralsight.portfoliomanager.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

// A credit card's balance is how much you owe.
public class CreditCard extends Account {

    public CreditCard(int accountNumber, String name, BigDecimal balance) {
        super(accountNumber, name, balance);
    }

    public void charge(BigDecimal amount) {
        setBalance(getBalance().add(amount).setScale(2, RoundingMode.HALF_UP));
    }

    public void pay(BigDecimal amount) {
        setBalance(getBalance().subtract(amount).setScale(2, RoundingMode.HALF_UP));
    }

    @Override
    public BigDecimal getValue() {
        return getBalance().negate();
    }
}
