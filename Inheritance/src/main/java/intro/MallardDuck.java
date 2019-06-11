package intro;

import example.fly.FlyWithWings;

public class MallardDuck extends Duck implements Quackable {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
    }

    public String quack() {
        return "Quack";
    }

    @Override
    public String display() {
        return "I am a mallard duck!";
    }
}
