package behaviour.abstract_factory;

public class DuckMovement implements AnimalMovement {

    @Override
    public String move() {
        return "Waddle";
    }
}
