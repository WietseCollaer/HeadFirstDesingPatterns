package behaviour.factory_method;

public class Silverback extends Animal {

    @Override
    public Behaviour createBehaviour() {
        return new SilverbackBehaviour();
    }
}
