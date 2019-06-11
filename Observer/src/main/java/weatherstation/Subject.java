package weatherstation;

public interface Subject {
    public void registerObserver(Observer observerToRegister);
    public void removeObserver(Observer observerToRemove);
    public void notifyObservers();
}
