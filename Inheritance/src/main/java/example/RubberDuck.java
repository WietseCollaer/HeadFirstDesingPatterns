package example;

import example.fly.FlyNoWay;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
    }

    @Override
    public String display() {
        return "I am a rubber duck!";
    }
}
