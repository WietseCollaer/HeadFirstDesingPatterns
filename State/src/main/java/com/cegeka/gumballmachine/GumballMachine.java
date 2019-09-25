package com.cegeka.gumballmachine;

public class GumballMachine {
    public final static int SOLD_OUT = 0;
    public final static int NO_QUARTER = 1;
    public final static int HAS_QAURTER = 2;
    public final static int SOLD = 3;

    private int count;
    private int state = SOLD_OUT;

    public GumballMachine(int count) {
        this.count = count;

        if(count > 0) {
            state = NO_QUARTER;
        }
    }

    public String insertQuarter() {
        if (state == HAS_QAURTER) {
            return "You can't insert another one";
        } else if (state == NO_QUARTER) {
            state = HAS_QAURTER;
            return "You inserted a quarter";
        } else if(state == SOLD_OUT) {
            return "You can't insert a quarter. The machine is sold out";
        } else if(state == SOLD) {
            return "Please wait, we are giving you a gumball";
        }
        return "UNKNOWN_STATE";
    }
}
