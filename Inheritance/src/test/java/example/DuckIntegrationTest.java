package example;

import org.junit.Test;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;
import static org.assertj.core.api.Assertions.assertThat;

public class DuckIntegrationTest {

    @Test
    public void ducksShouldHaveTheirSpecificBehavior() {
        List<Duck> ducks = newArrayList(
                new MallardDuck(),
                new RubberDuck()
        );

        assertThat(ducks)
                .extracting(Duck::performFly)
                .containsExactly("Fly", "I cannot fly :(");
    }
}
