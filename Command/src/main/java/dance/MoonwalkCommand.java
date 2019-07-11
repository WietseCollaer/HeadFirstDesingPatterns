package dance;

import static dance.Log.FAKE_ASS_LOG;

public class MoonwalkCommand implements Command {

    private Moonwalk moonwalk;
    private String result;

    public MoonwalkCommand(Moonwalk moonwalk) {
        this.moonwalk = moonwalk;
    }

    @Override
    public void execute() {
        result = moonwalk.michaelJackson();
        log();
    }

    @Override
    public void log() {
        FAKE_ASS_LOG.add(result);
    }
}
