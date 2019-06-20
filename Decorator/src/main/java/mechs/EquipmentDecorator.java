package mechs;

import java.util.List;

public abstract class EquipmentDecorator extends Mech {
    public abstract List<String> getLoadout();
    public abstract int getSpeed();
    public abstract int getStrength();
    public abstract int getDefense();
}
