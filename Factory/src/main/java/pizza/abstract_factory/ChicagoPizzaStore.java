package pizza.abstract_factory;

public class ChicagoPizzaStore extends PizzaStore {

    PizzaIngredientFactory ingredientFactory;

    public ChicagoPizzaStore() {
        this.ingredientFactory = new ChicagoPizzaIngredientFactory();
    }

    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new CheesePizza(ingredientFactory);
        } else return null;
    }
}
