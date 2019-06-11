package weatherstationWithJavaUtil;

import java.util.Observer;

public interface Subject {
    public void registerObserver(Observer observerToRegister);
    public void removeObserver(Observer observerToRemove);
    public void notifyObservers();
}
