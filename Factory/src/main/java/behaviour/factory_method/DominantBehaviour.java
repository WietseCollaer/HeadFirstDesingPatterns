package behaviour.factory_method;

import static behaviour.Behaviours.DOMINANT_BEHAVIOUR;

public class DominantBehaviour implements Behaviour {

    @Override
    public String getBehaviour() {
        return DOMINANT_BEHAVIOUR.getDescription();
    }
}
