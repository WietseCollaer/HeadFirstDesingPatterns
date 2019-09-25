package com.cegeka.podracer;

public class RacingState implements PodracerState {
    private final Podracer podracer;

    public RacingState(Podracer podracer) {
        this.podracer = podracer;
    }

    @Override
    public String enterPod() {
        return "It's dangerous to enter the pod when racing!";
    }

    @Override
    public String race() {
        return "Wow a race in a race!!";
    }

    @Override
    public String crash() {
        podracer.setCurrentState(podracer.crashedState);
        return "Boom patat";
    }
}
