package dance;

import org.junit.After;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static dance.Log.FAKE_ASS_LOG;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertTrue;

public class EpicChoreographyTest {

    private Arabesque arabesque = new Arabesque();

    private Spin180Command spin180Command = new Spin180Command();
    private Spin360Command spin360Command = new Spin360Command();
    private MoonwalkCommand moonwalkCommand = new MoonwalkCommand(new Moonwalk());
    private ArabesqueCommand arabesqueCommand = new ArabesqueCommand(new Arabesque());

    public static final String SPIN_180 = "Spin 180 degrees";
    public static final String SPIN_360 = "Spin 360 degrees";
    public static final String ARABESQUE = "Arabesque";
    public static final String MOONWALK = "Moonwalk";

    private List<String> result = new ArrayList();

    @Test
    public void dance() {
        EpicChoreography epicChoreography = new EpicChoreography(asList(spin180Command,
                                                                        spin360Command,
                                                                        moonwalkCommand,
                                                                        arabesqueCommand));
        result.add(SPIN_180);
        result.add(SPIN_360);
        result.add(MOONWALK);
        result.add(ARABESQUE);

        epicChoreography.dance();

        assertTrue(FAKE_ASS_LOG.containsAll(result));
    }

    @After
    public void tearDown() {
        Log.wipeLog();
    }
}