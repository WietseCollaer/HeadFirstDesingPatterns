package com.cegeka.podracer;

public class CrashedState implements PodracerState {
    private final Podracer podracer;

    public CrashedState(Podracer podracer) {
        this.podracer = podracer;
    }

    @Override
    public String enterPod() {
        return "You can enter but you can't race";
    }

    @Override
    public String race() {
        return "This is gonna be difficult!";
    }

    @Override
    public String crash() {
        return "You unlucky bastard";
    }
}
