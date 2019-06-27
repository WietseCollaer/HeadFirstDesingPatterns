package behaviour.abstract_factory;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalTest {

    public static final String DUCK_CALL = "Quack";
    public static final String DUCK_MOVEMENT = "Waddle";
    public static final String OWL_CALL = "Hoot";
    public static final String OWL_MOVEMENT = "Swoop";

    @Test
    public void animal_duck() {
        Animal duck = new Duck();
        assertEquals(duck.getObservedCall(), DUCK_CALL);
        assertEquals(duck.getObservedMovement(), DUCK_MOVEMENT);
    }

    @Test
    public void animal_owl() {
        Animal owl = new Owl();
        assertEquals(owl.getObservedCall(), OWL_CALL);
        assertEquals(owl.getObservedMovement(), OWL_MOVEMENT);
    }
}