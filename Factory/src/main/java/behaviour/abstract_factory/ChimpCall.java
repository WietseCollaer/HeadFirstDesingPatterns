package behaviour.abstract_factory;

import static behaviour.Behaviours.CHIMP_CALL;

public class ChimpCall implements AnimalCall {

    @Override
    public String call() {
        return CHIMP_CALL.getDescription();
    }
}
