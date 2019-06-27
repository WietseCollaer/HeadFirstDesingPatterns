package behaviour.abstract_factory;

public class OwlBehaviourFactory implements BehaviourFactory {

    @Override
    public AnimalCall makeCall() {
        return new OwlCall();
    }

    @Override
    public AnimalMovement generateMovement() {
        return new OwlMovement();
    }
}
