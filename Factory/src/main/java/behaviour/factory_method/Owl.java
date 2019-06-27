package behaviour.factory_method;

public class Owl extends Animal {

    @Override
    protected Behaviour createBehaviour() {
        return new HootBehaviour();
    }
}
