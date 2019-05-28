package notification;

import weatherForecast.WeatherForecast;

public class TvNews implements Observer {

    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Telewizja - Nowa progrnosa pogody: temperatura: " + weatherForecast.getTemperature() +
                " stopni, ciśnienie: " + weatherForecast.getPressure() + "hPa");
    }
}
