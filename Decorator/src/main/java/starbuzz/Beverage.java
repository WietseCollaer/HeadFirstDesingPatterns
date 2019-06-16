package starbuzz;

public abstract class Beverage {
    protected String description = "Abstract Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
