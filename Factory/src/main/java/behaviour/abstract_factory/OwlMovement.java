package behaviour.abstract_factory;

import static behaviour.Behaviours.OWL_MOVEMENT;

public class OwlMovement implements AnimalMovement {

    @Override
    public String move() {
        return OWL_MOVEMENT.getDescription();
    }
}
