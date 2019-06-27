package behaviour.abstract_factory;

public class Duck extends Animal {

    public Duck() {
        behaviourFactory = new DuckBehaviourFactory();
    }
}
