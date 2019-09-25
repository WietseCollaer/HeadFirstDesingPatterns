package com.cegeka.podracer;

import org.junit.Before;
import org.junit.Test;
import org.powermock.reflect.Whitebox;

import static org.assertj.core.api.Assertions.assertThat;

public class PodracerTest {
    private Podracer podracer;

    @Before
    public void setUp() {
        podracer = new Podracer();
    }

    @Test
    public void enterPod() {
        Whitebox.setInternalState(podracer, "currentState", podracer.noDriverState);

        assertThat(podracer.enterPod()).isEqualTo("Enter pod, ready to race");
    }

    @Test
    public void race_whenNoDriver_thenReturnCantRace() {
        Whitebox.setInternalState(podracer, "currentState", podracer.noDriverState);

        assertThat(podracer.race()).isEqualTo("Where is the pilot?");
    }

    @Test
    public void race_whenHasDriver_thenReturnLetsGo() {
        Whitebox.setInternalState(podracer, "currentState", podracer.hasDriverState);

        assertThat(podracer.race()).isEqualTo("Let's go");
    }

    @Test
    public void race_whenHasDriver_thenReturnLetsGoAndChangeToRacingState() {
        Whitebox.setInternalState(podracer, "currentState", podracer.hasDriverState);

        assertThat(podracer.race()).isEqualTo("Let's go");
        assertThat(podracer.getCurrentState()).isEqualTo(podracer.racingState);
    }

    @Test
    public void crash_whenRace_thenReturnBoom() {
        Whitebox.setInternalState(podracer, "currentState", podracer.racingState);

        assertThat(podracer.crash()).isEqualTo("Boom patat");
    }

    @Test
    public void crash_whenNotRacing_thenReturnCantCrash() {
        Whitebox.setInternalState(podracer, "currentState", podracer.noDriverState);

        assertThat(podracer.crash()).isEqualTo("You can't crash!");
    }
}
