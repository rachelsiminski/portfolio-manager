package com.pluralsight.portfoliomanager.model;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
class PortfolioTest {
    @Test
    public void getMostValuable_should_returnMostValuableIteminAssets() {
        Valuable asset1 = new BankAccount(1, "Tyler", new BigDecimal("1000000000"));
        Valuable asset2 = new BankAccount(2, "Atti", new BigDecimal("10000000000"));
        Valuable asset3 = new BankAccount(3, "Frankie", new BigDecimal("10000"));

        Portfolio portfolio = new Portfolio("Family", "Tyler");
        portfolio.add(asset1);
        portfolio.add(asset2);
        portfolio.add(asset3);

        Valuable expectedAsset = asset2;
        Valuable actualAsset = portfolio.getMostValuable();

        assertEquals(expectedAsset, actualAsset);
    }
}