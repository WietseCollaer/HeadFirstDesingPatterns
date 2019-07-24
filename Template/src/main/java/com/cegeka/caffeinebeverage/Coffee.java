package com.cegeka.caffeinebeverage;

public class Coffee extends CaffeineBeverage {
    protected static final String BREWING_COFFEE_BEANS = "Brewing coffee beans";
    protected static final String ADDING_MILK_AND_SUGAR = "adding milk and sugar";

    @Override
    public String brew() {
        return BREWING_COFFEE_BEANS;
    }

    @Override
    public String addCondiments() {
        return ADDING_MILK_AND_SUGAR;
    }
}
