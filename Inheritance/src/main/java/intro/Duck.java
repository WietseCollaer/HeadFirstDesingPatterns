package intro;

import example.fly.FlyBehavior;

public abstract class Duck {
    protected FlyBehavior flyBehavior;

    public String performFly() {
        return flyBehavior.fly();
    }

    public String swim() {
        return "Swim";
    }

    public abstract String display();
}
