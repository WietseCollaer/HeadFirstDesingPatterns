package com.cegeka.chocolateboiler;

public class ChocolateBoiler {
    protected static final String START_UP = "Starting up boiler";
    private static ChocolateBoiler chocolateBoiler;

    private boolean isFilled;

    private ChocolateBoiler() {
        isFilled = false;
        System.out.print(START_UP);
    }

    public static ChocolateBoiler getChocolateBoiler() {
        if (chocolateBoiler == null) {
            chocolateBoiler = new ChocolateBoiler();
        }

        return chocolateBoiler;
    }

    public void fill() {
        isFilled = true;
    }

    public void drain() {
        isFilled = false;
    }

    public boolean isFilled() {
        return isFilled;
    }
}
