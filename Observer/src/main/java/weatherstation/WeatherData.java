package weatherstation;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

public class WeatherData implements Subject {
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = newArrayList();
    }

    @Override
    public void registerObserver(Observer observerToRegister) {
        observers.add(observerToRegister);
    }

    @Override
    public void removeObserver(Observer observerToRemove) {
        observers.remove(observerToRemove);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(temperature, humidity, pressure));
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
