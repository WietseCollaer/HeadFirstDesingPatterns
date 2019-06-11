package example;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RubberDuckTest {

    private RubberDuck rubberDuck;

    @Before
    public void setUp() throws Exception {
        rubberDuck = new RubberDuck();
    }

    @Test
    public void display_shouldReturnIAmARubberDuck() {
        assertThat(rubberDuck.display()).isEqualTo("I am a rubber duck!");
    }

    @Test
    public void performFly_shouldNotBeAbleToFly() {
        assertThat(rubberDuck.performFly()).isEqualTo("I cannot fly :(");
    }
}
