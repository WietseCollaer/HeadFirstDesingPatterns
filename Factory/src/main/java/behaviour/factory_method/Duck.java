package behaviour.factory_method;

public class Duck extends Animal {

    @Override
    protected Behaviour createBehaviour() {
        return new DominantBehaviour();
    }
}
