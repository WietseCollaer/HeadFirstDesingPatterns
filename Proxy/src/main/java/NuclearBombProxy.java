public class NuclearBombProxy implements NuclearBombInterface {
    private NuclearBomb actualBomb = new NuclearBomb();
    private NuclearBombRole role;

    public NuclearBombProxy(NuclearBombRole role) {
        this.role = role;
    }

    @Override
    public String detonate() {
        if (role == NuclearBombRole.DEVELOPER) {
            return DEVELOPER_CANNOT_DETONATE;
        }
        return actualBomb.detonate();
    }

    @Override
    public String setTarget(int x, int y) {
        if (role == NuclearBombRole.DEVELOPER) {
            return DEVELOPER_CANNOT_SET_TARGET;
        }
        return actualBomb.setTarget(x, y);
    }

    @Override
    public String repairAndUpgrade() {
        if (role == NuclearBombRole.PRESIDENT) {
            return PRESIDENT_CANNOT_DO_MAINTAIN;
        }
        return MAINTENANCE;
    }
}
