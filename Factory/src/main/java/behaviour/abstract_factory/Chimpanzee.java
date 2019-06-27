package behaviour.abstract_factory;

public class Chimpanzee extends Animal {

    public Chimpanzee() {
        behaviourFactory = new ChimpanzeeBehaviourFactory();
    }
}
