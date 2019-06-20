package mechs;

import java.util.List;

public class RocketBoosters extends EquipmentDecorator {
    public static final int SPEED_MODIFIER = 20;
    private Mech mech;

    public RocketBoosters(Mech mech) {
        this.mech = mech;
    }

    @Override
    public List<String> getLoadout() {
        List<String> loadout = mech.getLoadout();
        loadout.add("Rocket Boosters");
        return loadout;
    }

    @Override
    public int getSpeed() {
        return mech.getSpeed() + SPEED_MODIFIER;
    }

    @Override
    public int getStrength() {
        return mech.getStrength();
    }

    @Override
    public int getDefense() {
        return mech.getDefense();
    }
}
