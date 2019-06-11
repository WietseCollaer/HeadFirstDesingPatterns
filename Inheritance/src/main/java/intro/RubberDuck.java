package intro;

public class RubberDuck extends Duck implements Quackable {

    @Override
    public String quack() {
        return "Squeak";
    }

    @Override
    public String display() {
        return "I am a rubber duck!";
    }
}
