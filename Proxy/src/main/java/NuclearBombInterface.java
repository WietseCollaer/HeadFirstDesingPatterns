public interface NuclearBombInterface {
    public static final String DEVELOPER_CANNOT_DETONATE = "A maintenance developer cannot detonate a nuclear bomb!";
    public static final String DEVELOPER_CANNOT_SET_LOCATION = "A maintenance developer cannot the bomb's location!";
    public static final String PRESIDENT_CANNOT_DO_MAINTAIN = "The maintenance of a nuclear bomb is not a job for a president.";
    public static final String DETONATE = "Everyone at %s,%s is dead.";
    public static final String TARGET_SET = "Bomb target has been set to %s,%s.";
    public static final String MAINTENANCE = "Bomb has been repaired and upgraded to latest JavaScript version.";

    String detonate();

    String setTarget(int x, int y);

    String repairAndUpgrade();
}
