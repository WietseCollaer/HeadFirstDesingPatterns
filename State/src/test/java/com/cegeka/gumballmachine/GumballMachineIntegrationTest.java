package com.cegeka.gumballmachine;

import org.junit.Before;
import org.junit.Test;
import org.powermock.reflect.Whitebox;

import static org.assertj.core.api.Assertions.assertThat;

public class GumballMachineIntegrationTest {

    private GumballMachine gumballMachine;

    @Before
    public void setUp() {
        gumballMachine = new GumballMachine(20);
    }

    @Test
    public void insertQuarter_whenHasQuarter_thenRespond() {
        Whitebox.setInternalState(gumballMachine, "state", 2);

        assertThat(gumballMachine.insertQuarter()).isEqualTo("You can't insert another one");
    }

    @Test
    public void insertQuarter_whenNoQuarter_thenRespond() {
        Whitebox.setInternalState(gumballMachine, "state", 1);

        assertThat(gumballMachine.insertQuarter()).isEqualTo("You inserted a quarter");
    }

    @Test
    public void insertQuarter_whenSoldOut_thenRespond() {
        Whitebox.setInternalState(gumballMachine, "state", 0);

        assertThat(gumballMachine.insertQuarter()).isEqualTo("You can't insert a quarter. The machine is sold out");
    }
    @Test
    public void insertQuarter_whenSold_thenRespond() {
        Whitebox.setInternalState(gumballMachine, "state", 3);

        assertThat(gumballMachine.insertQuarter()).isEqualTo("Please wait, we are giving you a gumball");
    }
}
