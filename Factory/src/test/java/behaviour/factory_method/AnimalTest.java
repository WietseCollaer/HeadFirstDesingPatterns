package behaviour.factory_method;

import org.junit.Test;

import static behaviour.Behaviours.DOMINANT_BEHAVIOUR;
import static behaviour.Behaviours.MONKEY_BEHAVIOUR;
import static behaviour.Behaviours.OWL_CALL;
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

    @Test
    public void animal_owl() {
        Animal owl = new Owl();
        owl.beAlive();
        assertEquals(owl.getObservedBehaviour(), OWL_CALL.getDescription());
    }

    @Test
    public void animal_duck() {
        Animal duck = new Duck();
        duck.beAlive();
        assertEquals(duck.getObservedBehaviour(), DOMINANT_BEHAVIOUR.getDescription());
    }
}