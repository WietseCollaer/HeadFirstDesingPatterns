package behaviour.abstract_factory;

import static behaviour.Behaviours.OWL_CALL;

public class OwlCall implements AnimalCall {

    @Override
    public String call() {
        return OWL_CALL.getDescription();
    }
}
