package com.cegeka.bmwtemplate;

public class BmwMotorcycle extends BmwTemplate {

    protected static final String ADDING_MOTORCYCLE_BODY = "Adding motorcycle body";
    protected static final String ADDING_TWO_WHEELS = "Adding two wheels";
    private boolean sexyHorn;

    public BmwMotorcycle() {
        sexyHorn = false;
    }

    public BmwMotorcycle(boolean sexyHorn) {
        this.sexyHorn = sexyHorn;
    }

    @Override
    protected boolean addSexyHorn() {
        return this.sexyHorn;
    }

    @Override
    protected String addBody() {
        return ADDING_MOTORCYCLE_BODY;
    }

    @Override
    protected String addWheels() {
        return ADDING_TWO_WHEELS;
    }
}
