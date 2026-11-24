package com.pluralsight.portfoliomanager.model;

import java.math.BigDecimal;
import java.util.ArrayList;
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
        double sum = assets.get(0).getValue().doubleValue();
        for (Valuable asset : assets) {
            sum += asset.getValue().doubleValue();
        }
        return sum;
    }

    public Valuable getMostValuable() {
        Valuable highestValue = assets.get(0);
        for (Valuable asset : assets) {
            if (asset.getValue().compareTo(highestValue.getValue()) > 0) {
                highestValue = asset;
            }
        }
        return highestValue;
    }

    public Valuable getLeastValuable() {
        Valuable lowestValue = assets.get(0);
        for (Valuable asset : assets) {
            if (asset.getValue().compareTo(lowestValue.getValue()) < 0) {
                lowestValue = asset;
            }
        }
        return lowestValue;
    }
}
