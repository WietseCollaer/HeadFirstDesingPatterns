package example.fly;

public class FlyNoWay implements FlyBehavior {
    @Override
    public String fly() {
        return "I cannot fly :(";
    }
}
