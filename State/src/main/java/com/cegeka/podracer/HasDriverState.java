package com.cegeka.podracer;

public class HasDriverState implements PodracerState {
    private final Podracer podracer;

    public HasDriverState(Podracer podracer) {
        this.podracer = podracer;
    }

    @Override
    public String enterPod() {
        return "It's a bit cosy in here with two drivers";
    }

    @Override
    public String race() {
        podracer.setCurrentState(podracer.racingState);
        return "Let's go";
    }

    @Override
    public String crash() {
        return "You can't crash!";
    }
}
