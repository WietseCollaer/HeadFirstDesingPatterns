package mechs;

import java.util.List;

public class GatlingGun extends EquipmentDecorator {
    public static final int STRENGTH_MODIFIER = 10;
    private Mech mech;

    public GatlingGun(Mech mech) {
        super();
        this.mech = mech;
    }

    @Override
    public List<String> getLoadout() {
        List<String> loadout = mech.getLoadout();
        loadout.add("Gatling Gun");
        return loadout;
    }

    @Override
    public int getSpeed() {
        return mech.getSpeed();
    }

    @Override
    public int getStrength() {
        return mech.getStrength() + STRENGTH_MODIFIER;
    }

    @Override
    public int getDefense() {
        return mech.getDefense();
    }
}
