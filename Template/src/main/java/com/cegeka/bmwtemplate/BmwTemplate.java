package com.cegeka.bmwtemplate;

/*
    1. Create engine and chassis
    2. Add wheels
    3. Add body
    4. Clean
 */

public abstract class BmwTemplate {

    protected static final String CLEANING_VEHICLE = "cleaning vehicle";
    protected static final String ASSEMBLING_ENGINE_AND_CHASSIS = "Assembling engine and chassis";
    protected static final String WITH_SEXY_HORN = "with sexy horn";

    public String constructVehicle() {
        return createEngineAndChassis() + " " + addWheels() + " " + addBody() + " " + clean();
    }

    protected abstract String addBody();

    protected abstract String addWheels();

    protected boolean addSexyHorn() {
        return false;
    }

    private String clean() {
        return CLEANING_VEHICLE;
    }

    private String createEngineAndChassis() {
        String assemblyString = ASSEMBLING_ENGINE_AND_CHASSIS;
        if (addSexyHorn()) {
            assemblyString += " " + WITH_SEXY_HORN;
        }

        return assemblyString;
    }
}
