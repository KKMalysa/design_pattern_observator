package notification;

import weatherForecast.WeatherForecast;

public class RadioNews implements Observer {
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Radio - Nowa progrnosa pogody: temperatura: " + weatherForecast.getTemperature() +
                " stopni, ciśnienie: " + weatherForecast.getPressure() + "hPa");
    }
}
