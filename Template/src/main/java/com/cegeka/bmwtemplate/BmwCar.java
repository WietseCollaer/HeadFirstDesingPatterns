package com.cegeka.bmwtemplate;

public class BmwCar extends BmwTemplate {

    protected static final String ADDING_CAR_BODY = "Adding car body";
    protected static final String ADDING_FOUR_WHEELS = "Adding four wheels";
    private boolean sexyHorn;

    public BmwCar() {
        sexyHorn = false;
    }

    public BmwCar(boolean sexyHorn) {
        this.sexyHorn = sexyHorn;
    }

    @Override
    protected boolean addSexyHorn() {
        return this.sexyHorn;
    }

    @Override
    protected String addBody() {
        return ADDING_CAR_BODY;
    }

    @Override
    protected String addWheels() {
        return ADDING_FOUR_WHEELS;
    }
}
