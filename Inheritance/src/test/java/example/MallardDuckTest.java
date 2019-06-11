package example;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MallardDuckTest {
    private MallardDuck mallardDuck;

    @Before
    public void setUp() throws Exception {
        mallardDuck = new MallardDuck();
    }

    @Test
    public void display_shouldReturnIAmARubberDuck() {
        assertThat(mallardDuck.display()).isEqualTo("I am a mallard duck!");
    }

    @Test
    public void performFly_shouldNotBeAbleToFly() {
        assertThat(mallardDuck.performFly()).isEqualTo("Fly");
    }

}
