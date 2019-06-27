package behaviour.abstract_factory;

public abstract class Animal {

    protected BehaviourFactory behaviourFactory;

    public String getObservedCall() {
        return behaviourFactory.makeCall().call();
    }

    public String getObservedMovement() {
        return behaviourFactory.generateMovement().move();
    }
}
