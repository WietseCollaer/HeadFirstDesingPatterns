package example;

import example.fly.FlyWithWings;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
    }

    @Override
    public String display() {
        return "I am a mallard duck!";
    }
}
