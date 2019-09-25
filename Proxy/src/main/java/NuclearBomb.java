public class NuclearBomb implements NuclearBombInterface {
    private int locationX = 0;
    private int locationY = 0;

    @Override
    public String detonate() {
        return String.format(DETONATE, this.locationX, this.locationY);
    }

    @Override
    public String setTarget(int x, int y) {
        this.locationX = x;
        this.locationY = y;
        return String.format(TARGET_SET, this.locationX, this.locationY);
    }

    @Override
    public String repairAndUpgrade() {
        return MAINTENANCE;
    }
}
