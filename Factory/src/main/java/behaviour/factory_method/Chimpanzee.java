package behaviour.factory_method;

public class Chimpanzee extends Animal {

    @Override
    protected Behaviour createBehaviour() {
        return new MonkeyBusinessBehaviour();
    }
}
