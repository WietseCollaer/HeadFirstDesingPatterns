package com.cegeka.podracer;

public class Podracer {
    public final CrashedState crashedState = new CrashedState(this);
    public final HasDriverState hasDriverState = new HasDriverState(this);
    public final NoDriverState noDriverState = new NoDriverState(this);
    public final RacingState racingState = new RacingState(this);

    private PodracerState currentState = noDriverState;

    public PodracerState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(PodracerState currentState) {
        this.currentState = currentState;
    }

    public String enterPod(){
        return currentState.enterPod();
    }
    public String race(){
        return currentState.race();
    }
    public String crash(){
        return currentState.crash();
    }
}
