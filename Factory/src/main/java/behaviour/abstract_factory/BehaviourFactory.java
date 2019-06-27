package behaviour.abstract_factory;

public interface BehaviourFactory {

    AnimalCall makeCall();

    AnimalMovement generateMovement();

}
