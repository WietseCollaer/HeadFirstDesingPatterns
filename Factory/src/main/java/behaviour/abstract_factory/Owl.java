package behaviour.abstract_factory;

public class Owl extends Animal {

    public Owl() {
        behaviourFactory = new OwlBehaviourFactory();
    }
}
