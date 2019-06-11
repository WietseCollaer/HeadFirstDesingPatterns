package weatherstation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class WeatherStationIntegrationTest {
    private static final float HUMIDITY = 40;
    private static final float TEMPERATURE = 25;
    private static final float PRESSURE = 1013;
    private static final String EXPECTED_OUTPUT = "The current temperature is: " + TEMPERATURE + " with a humidity of " + HUMIDITY + "%";

    private ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void setMeasurements_whenMeasurementsChanged_thenTheObserverPrintsTheNewWeather() {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(TEMPERATURE, HUMIDITY, PRESSURE);

        assertThat(outputStream.toString()).isEqualTo(EXPECTED_OUTPUT);
    }

    @Test
    public void setMeasurements_whenMeasurementsChanged_thenEachObserverPrintsTheNewWeather() {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay firstDisplay = new CurrentConditionDisplay(weatherData);
        CurrentConditionDisplay secondDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(TEMPERATURE, HUMIDITY, PRESSURE);
        assertThat(outputStream.toString()).isEqualTo(EXPECTED_OUTPUT + EXPECTED_OUTPUT);
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }
}
