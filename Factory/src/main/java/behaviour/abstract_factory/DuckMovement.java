package behaviour.abstract_factory;

import static behaviour.Behaviours.DUCK_MOVEMENT;

public class DuckMovement implements AnimalMovement {

    @Override
    public String move() {
        return DUCK_MOVEMENT.getDescription();
    }
}
