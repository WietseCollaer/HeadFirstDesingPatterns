package behaviour.factory_method;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalTest {

    public static final String DOMINANT_BEHAVIOUR = "Assert dominance";
    public static final String MONKEY_BEHAVIOUR = "Throw feces";

    @Test
    public void animal_silverback() {
        Animal silverback = new Silverback();
        silverback.beAlive();
        assertEquals(silverback.getObservedBehaviour(), DOMINANT_BEHAVIOUR);
    }

    @Test
    public void animal_chimp() {
        Animal chimp = new Chimpanzee();
        chimp.beAlive();
        assertEquals(chimp.getObservedBehaviour(), MONKEY_BEHAVIOUR);
    }
}