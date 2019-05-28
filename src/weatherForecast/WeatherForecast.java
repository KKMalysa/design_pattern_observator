package weatherForecast;

import notification.Observer;

import java.util.HashSet;
import java.util.Set;

public class WeatherForecast {
    private int temperature;
    private int pressure;
    Set<Observer> registeredObservers = new HashSet<Observer>();

    public WeatherForecast(int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
    }

    public void registerObserver(Observer observer){
        registeredObservers.add(observer);
    }

    public void unregisterObserver(Observer observer){
        registeredObservers.remove(observer);
    }

    public void notifyObservers(){
        for (Observer observer : registeredObservers){
            observer.updateForecast(this);
        }
    }
    public void updateWeatherForecast(WeatherForecast weatherForecast){
        weatherForecast.setTemperature(3);
        weatherForecast.setPressure(999);
        notifyObservers();
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }
}
