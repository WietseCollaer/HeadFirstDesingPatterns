package mechs;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

public abstract class Mech {
    protected String mechName;
    protected int speed;
    protected int strength;
    protected int defense;

    public List<String> getLoadout() {
        return newArrayList(mechName);
    }

    public int getSpeed() {
        return speed;
    }

    public int getStrength() {
        return strength;
    }

    public int getDefense() {
        return defense;
    }
}
