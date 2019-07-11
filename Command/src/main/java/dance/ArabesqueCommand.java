package dance;

import static dance.Log.FAKE_ASS_LOG;

public class ArabesqueCommand implements Command {

    private Arabesque arabesque;
    private String result;

    public ArabesqueCommand() {
        arabesque = new Arabesque();
    }

    @Override
    public void execute() {
        result = arabesque.balletItUp();
        log();
    }

    @Override
    public void log() {
        FAKE_ASS_LOG.add(result);
    }
}
