package com.cegeka.caffeinebeverage;

public class Tea extends CaffeineBeverage {

    protected static final String STEEPING_TEA_BAG = "Steeping tea bag";
    protected static final String ADDING_LEMON = "Adding lemon";

    @Override
    public String brew() {
        return STEEPING_TEA_BAG;
    }

    @Override
    public String addCondiments() {
        return ADDING_LEMON;
    }
}
