package orchestra;

public class Musician implements Observable {
    private String timeSignature;

    @Override
    public void listenToConductor(String timeSignature) {
        this.timeSignature = timeSignature;
        this.playMusic();
    }

    public void playMusic() {
        System.out.print("I am playing in " + timeSignature);
    }
}
