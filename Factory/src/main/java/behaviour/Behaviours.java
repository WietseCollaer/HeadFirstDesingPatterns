package behaviour;

public enum Behaviours {

    DOMINANT_BEHAVIOUR("Assert dominance"),
    MONKEY_BEHAVIOUR("Throw feces"),
    DUCK_CALL("Quack"),
    DUCK_MOVEMENT( "Waddle"),
    OWL_CALL("Hoot"),
    OWL_MOVEMENT("Swoop"),
    CHIMP_MOVEMENT("Swing"),
    CHIMP_CALL("Ook");


    private final String description;

    Behaviours(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
