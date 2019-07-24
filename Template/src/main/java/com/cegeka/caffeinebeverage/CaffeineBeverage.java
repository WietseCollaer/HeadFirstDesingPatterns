package com.cegeka.caffeinebeverage;

public abstract class CaffeineBeverage {
    protected static final String POUR_IN_CUP = "Pour in cup";
    protected static final String BOILING_WATER = "Boiling water";

    public String prepareRecipe() {
        return boilWater() + " " + brew() + " " + pourInCup() + " " + addCondiments();
    }

    private String pourInCup() {
        return POUR_IN_CUP;
    }

    private String boilWater() {
        return BOILING_WATER;
    }

    public abstract String brew();
    public abstract String addCondiments();


}
