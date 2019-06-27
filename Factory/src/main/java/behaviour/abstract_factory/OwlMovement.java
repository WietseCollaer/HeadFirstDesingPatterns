package behaviour.abstract_factory;

public class OwlMovement implements AnimalMovement {

    @Override
    public String move() {
        return "Swoop";
    }
}
