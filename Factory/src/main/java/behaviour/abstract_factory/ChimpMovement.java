package behaviour.abstract_factory;

import static behaviour.Behaviours.CHIMP_MOVEMENT;

public class ChimpMovement implements AnimalMovement {

    @Override
    public String move() {
        return CHIMP_MOVEMENT.getDescription();
    }
}
