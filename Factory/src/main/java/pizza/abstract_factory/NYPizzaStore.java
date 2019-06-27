package pizza.abstract_factory;

public class NYPizzaStore extends PizzaStore {

    PizzaIngredientFactory ingredientFactory;

    public NYPizzaStore() {
        this.ingredientFactory = new NYPizzaIngredientFactory();
    }

    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new CheesePizza(ingredientFactory);
        } else return null;
    }
}
