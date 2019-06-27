package behaviour.factory_method;

import org.junit.Test;

import static behaviour.Behaviours.DOMINANT_BEHAVIOUR;
import static behaviour.Behaviours.MONKEY_BEHAVIOUR;
import static org.junit.Assert.assertEquals;

public class AnimalTest {

    @Test
    public void animal_silverback() {
        Animal silverback = new Silverback();
        silverback.beAlive();
        assertEquals(silverback.getObservedBehaviour(), DOMINANT_BEHAVIOUR.getDescription());
    }

    @Test
    public void animal_chimp() {
        Animal chimp = new Chimpanzee();
        chimp.beAlive();
        assertEquals(chimp.getObservedBehaviour(), MONKEY_BEHAVIOUR.getDescription());
    }
}