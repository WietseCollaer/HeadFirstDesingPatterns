package behaviour.factory_method;

import static behaviour.Behaviours.MONKEY_BEHAVIOUR;

public class MonkeyBusinessBehaviour implements Behaviour {

    @Override
    public String getBehaviour() {
        return MONKEY_BEHAVIOUR.getDescription();
    }
}
