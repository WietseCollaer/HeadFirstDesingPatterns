package mechs;

import java.util.List;

public class Shield extends EquipmentDecorator {
    public static final int DEFENSE_MODIFIER = 5;
    private Mech mech;

    public Shield(Mech mech) {
        super();
        this.mech = mech;
    }

    @Override
    public List<String> getLoadout() {
        List<String> loadout = mech.getLoadout();
        loadout.add("Shield");
        return loadout;
    }

    @Override
    public int getSpeed() {
        return mech.getSpeed();
    }

    @Override
    public int getStrength() {
        return mech.getStrength();
    }

    @Override
    public int getDefense() {
        return mech.getDefense() + DEFENSE_MODIFIER;
    }
}
