package com.cegeka.chocolateboiler;

import com.cegeka.meetingroom.MeetingRoom;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.powermock.reflect.Whitebox;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class ChocolateBoilerTest {
    private ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outputStream));
        Whitebox.setInternalState(ChocolateBoiler.class, "chocolateBoiler", (ChocolateBoiler) null);
    }

    @Test
    public void getChocolateBoiler_whenRequestingTheBoilerForTheFirstTime_thenPrintStartUpOnce() {
        ChocolateBoiler.getChocolateBoiler();

        assertThat(outputStream.toString()).containsOnlyOnce(ChocolateBoiler.START_UP);
    }

    @Test
    public void getChocolateBoiler_whenRequestingTheBoilerMoreThanOnce_thenPrintStartUpOnce() {
        ChocolateBoiler.getChocolateBoiler();
        ChocolateBoiler.getChocolateBoiler();
        ChocolateBoiler.getChocolateBoiler();
        ChocolateBoiler.getChocolateBoiler();

        assertThat(outputStream.toString()).containsOnlyOnce(ChocolateBoiler.START_UP);
    }

    @Test
    public void fillBoiler_whenFilled_thenEverytimeGetChocolateBoilerShouldReturnIsFilledTrue() {
        ChocolateBoiler chocolateBoiler1 = ChocolateBoiler.getChocolateBoiler();
        ChocolateBoiler chocolateBoiler2 = ChocolateBoiler.getChocolateBoiler();

        chocolateBoiler1.fill();

        assertThat(outputStream.toString()).containsOnlyOnce(ChocolateBoiler.START_UP);
        assertThat(chocolateBoiler2.isFilled()).isTrue();
    }

    @Test
    public void fillBoiler_whenFilledAndDrained_thenEverytimeGetChocolateBoilerShouldReturnIsFilledFalse() {
        ChocolateBoiler chocolateBoiler1 = ChocolateBoiler.getChocolateBoiler();
        ChocolateBoiler chocolateBoiler2 = ChocolateBoiler.getChocolateBoiler();

        chocolateBoiler1.fill();
        chocolateBoiler2.drain();

        assertThat(outputStream.toString()).containsOnlyOnce(ChocolateBoiler.START_UP);
        assertThat(chocolateBoiler1.isFilled()).isFalse();
    }

    @After
    public void tearDown() {
        System.setOut(System.out);
    }
}
