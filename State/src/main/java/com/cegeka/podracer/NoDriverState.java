package com.cegeka.podracer;

public class NoDriverState implements PodracerState {
    private final Podracer podracer;

    public NoDriverState(Podracer podracer) {
        this.podracer = podracer;
    }

    @Override
    public String enterPod() {
        return "Enter pod, ready to race";
    }

    @Override
    public String race() {
        return "Where is the pilot?";
    }

    @Override
    public String crash() {
        return "You can't crash!";
    }
}
