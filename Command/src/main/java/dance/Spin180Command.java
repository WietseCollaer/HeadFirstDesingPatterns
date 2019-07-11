package dance;

import static dance.Log.FAKE_ASS_LOG;

public class Spin180Command implements Command {

    private Spin spin;
    private String result;

    public Spin180Command() {
        this.spin = new Spin(180);
    }

    @Override
    public void execute() {
        result = spin.spin();
        log();
    }

    @Override
    public void log() {
        FAKE_ASS_LOG.add(result);
    }

}
