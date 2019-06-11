package intro;

public class RedHeadDuck extends Duck implements Flyable, Quackable {

    public String quack() {
        return "Quack";
    }

    public String fly() {
        return "Fly";
    }

    @Override
    public String display() {
        return "I am a redhead duck!";
    }
}
