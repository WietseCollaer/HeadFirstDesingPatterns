package behaviour.abstract_factory;

public class DuckCall implements AnimalCall {

    @Override
    public String call() {
        return "Quack";
    }
}
