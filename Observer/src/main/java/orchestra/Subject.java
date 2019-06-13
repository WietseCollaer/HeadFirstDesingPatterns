package orchestra;

public interface Subject {
    public void register(Observable observableToRegister);
    public void remove(Observable observableToRemove);
    public void timeSignatureChanged(String timeSignature);
}
