package com.pluralsight.portfoliomanager;

import com.pluralsight.portfoliomanager.model.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class FinanceApplication {

    public static void main(String[] args) {
        House house = new House("Ranch house", new BigDecimal("325000.00"), 1998, 1850, 3);
        Gold gold = new Gold("Gold coins", new BigDecimal("12000.00"), 5.0);
        Jewelry ring = new Jewelry("Grandma's ring", new BigDecimal("2500.00"), 14.0);

        System.out.println(house.getName() + ": $" + house.getValue());
        System.out.println(gold.getName() + ": $" + gold.getValue());
        System.out.println(ring.getName() + ": $" + ring.getValue());

        // TODO: Workbook 6a p. 30, Part 2
        BankAccount account1 = new BankAccount(123, "Pam", new BigDecimal("12500"));
        Valuable account2 = new BankAccount(456, "Gary", new BigDecimal("1500"));

        // try to deposit money into both accounts
        account1.deposit(new BigDecimal("100"));
        account1.getValue();
        // account2.deposit(new BigDecimal("100"));

        Valuable asset1 = new BankAccount(1, "Tyler", new BigDecimal("1000000000"));
        Valuable asset2 = new BankAccount(2, "Atti", new BigDecimal("10000000000"));
        Valuable asset3 = new BankAccount(3, "Frankie", new BigDecimal("10000"));
        Portfolio portfolio = new Portfolio("Family", "Tyler");
        portfolio.add(asset1);
        portfolio.add(asset2);
        portfolio.add(asset3);

        for (Valuable asset : portfolio.getAssets()) {
            System.out.println(asset.getValue());
        }
        System.out.println(portfolio.getValue());
    }
}
