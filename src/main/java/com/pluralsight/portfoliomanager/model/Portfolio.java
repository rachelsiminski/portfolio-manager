package com.pluralsight.portfoliomanager.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Portfolio {
    private String name;
    private String owner;
    private List<Valuable> assets;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        assets = new ArrayList<Valuable>();
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Valuable> getAssets() {
        return assets;
    }

    public void add(Valuable valuable) {
        assets.add(valuable);
    }

    public double getValue() {
        double sum = 0;
        for (Valuable asset : assets) {
            sum += asset.getValue().doubleValue();
        }
        return sum;
    }

    public Valuable getMostValuable() {
        sortList();
        return assets.get(assets.size() - 1);
    }

    public Valuable getLeastValuable() {
        sortList();
        return assets.get(0);
    }

    public void sortList() {
        assets.sort(Comparator.comparing(Valuable::getValue));
    }
}
