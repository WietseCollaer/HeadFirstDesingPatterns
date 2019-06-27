package pizza.factory_method;

import java.util.ArrayList;

public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    public abstract void prepare();

    public abstract void bake();

    public abstract void cut();

    public abstract void box();

    public String getName() {
        return name;
    }
}
