package behaviour.abstract_factory;

public class ChimpanzeeBehaviourFactory implements BehaviourFactory {

    @Override
    public AnimalCall makeCall() {
        return new ChimpCall();
    }

    @Override
    public AnimalMovement generateMovement() {
        return new ChimpMovement();
    }
}
