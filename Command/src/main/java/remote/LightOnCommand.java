package remote;

public class LightOnCommand implements Command {

    private Light light;

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }

    public LightOnCommand(Light light) {
        this.light = light;
    }

}
