package behaviour.factory_method;

import static behaviour.Behaviours.OWL_CALL;

public class HootBehaviour implements Behaviour {

    @Override
    public String getBehaviour() {
        return OWL_CALL.getDescription();
    }
}
