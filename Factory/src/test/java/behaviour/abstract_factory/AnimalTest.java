package behaviour.abstract_factory;

import org.junit.Test;

import static behaviour.Behaviours.CHIMP_CALL;
import static behaviour.Behaviours.CHIMP_MOVEMENT;
import static behaviour.Behaviours.DUCK_CALL;
import static behaviour.Behaviours.DUCK_MOVEMENT;
import static behaviour.Behaviours.OWL_CALL;
import static behaviour.Behaviours.OWL_MOVEMENT;
import static org.junit.Assert.assertEquals;

public class AnimalTest {

    @Test
    public void animal_duck() {
        Animal duck = new Duck();
        assertEquals(duck.getObservedCall(), DUCK_CALL.getDescription());
        assertEquals(duck.getObservedMovement(), DUCK_MOVEMENT.getDescription());
    }

    @Test
    public void animal_owl() {
        Animal owl = new Owl();
        assertEquals(owl.getObservedCall(), OWL_CALL.getDescription());
        assertEquals(owl.getObservedMovement(), OWL_MOVEMENT.getDescription());
    }

    @Test
    public void animal_chimp() {
        Animal chimp = new Chimpanzee();
        assertEquals(chimp.getObservedCall(), CHIMP_CALL.getDescription());
        assertEquals(chimp.getObservedMovement(), CHIMP_MOVEMENT.getDescription());
    }
}