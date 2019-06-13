package orchestra;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class OrchestraIntegrationTest {

    private static final String EXPECTED_OUTPUT = "I am playing in 3";
    private ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void orchestraPlaying_timeSignatureChangedWithOneMusician() {
        Conductor conductor = new Conductor();
        Musician musician = new Musician();
        conductor.register(musician);

        conductor.timeSignatureChanged("3");

        assertThat(outputStream.toString()).isEqualTo(EXPECTED_OUTPUT);
    }

    @Test
    public void orchestraPlaying_timeSignatureChangedWithMultipleMusicians() {
        Conductor conductor = new Conductor();
        Musician violinist = new Musician();
        Musician trumpetist = new Musician();
        conductor.register(violinist);
        conductor.register(trumpetist);

        conductor.timeSignatureChanged("3");

        assertThat(outputStream.toString()).isEqualTo(EXPECTED_OUTPUT + EXPECTED_OUTPUT);
    }

    @After
    public void tearDown() throws Exception {
        System.setOut(System.out);
    }
}
