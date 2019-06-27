package behaviour.factory_method;

public class Monkey extends Animal {

    @Override
    public Behaviour createBehaviour() {
        return new MonkeyBehaviour();
    }
}
