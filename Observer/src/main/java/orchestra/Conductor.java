package orchestra;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

public class Conductor implements Subject {
    private String currentTimeSignature;
    private List<Observable> musicians;

    public Conductor() {
        musicians = newArrayList();
    }

    @Override
    public void register(Observable observableToRegister) {
        musicians.add(observableToRegister);
    }

    @Override
    public void remove(Observable observableToRemove) {
        musicians.remove(observableToRemove);
    }

    @Override
    public void timeSignatureChanged(String timeSignature) {
        musicians.forEach(musician -> musician.listenToConductor(timeSignature));
    }

    public void setCurrentTimeSignature(String currentTimeSignature) {
        this.currentTimeSignature = currentTimeSignature;
        timeSignatureChanged(currentTimeSignature);
    }
}
