package behaviour.abstract_factory;

import static behaviour.Behaviours.DUCK_CALL;

public class DuckCall implements AnimalCall {

    @Override
    public String call() {
        return DUCK_CALL.getDescription();
    }
}
