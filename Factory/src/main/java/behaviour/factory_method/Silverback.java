package behaviour.factory_method;

public class Silverback extends Animal {

    @Override
    protected Behaviour createBehaviour() {
        return new DominantBehaviour();
    }
}
