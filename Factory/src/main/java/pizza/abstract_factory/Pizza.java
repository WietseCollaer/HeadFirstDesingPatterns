package pizza.abstract_factory;

public abstract class Pizza {

    Dough dough;
    Sauce sauce;
    Cheese cheese;

    public abstract void prepare();
}
