package behaviour.factory_method;

public abstract class Animal {

    private String observedBehaviour;

    public void beAlive() {
        observedBehaviour = createBehaviour().getBehaviour();
    }

    protected abstract Behaviour createBehaviour();

    public String getObservedBehaviour() {
        return observedBehaviour;
    }
}
