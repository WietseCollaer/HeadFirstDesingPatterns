package example;

import example.fly.FlyBehavior;

public abstract class Duck {
    protected FlyBehavior flyBehavior;

//    Duck(FlyBehavior flyBehavior) {
//        this.flyBehavior = flyBehavior;
//    }

    public abstract String display();

    public String swim() {
        return "Swim";
    }

    public String performFly() {
        return flyBehavior.fly();
    }
}
