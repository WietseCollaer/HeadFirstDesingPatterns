package behaviour.abstract_factory;

public class DuckBehaviourFactory implements BehaviourFactory {

    @Override
    public AnimalCall makeCall() {
        return new DuckCall();
    }

    @Override
    public AnimalMovement generateMovement() {
        return new DuckMovement();
    }
}
