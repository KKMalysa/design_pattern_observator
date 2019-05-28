package notification;

import weatherForecast.WeatherForecast;

public class InternetNews implements Observer {


    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Internet - Nowa progrnosa pogody: temperatura: " + weatherForecast.getTemperature() +
                                                        " stopni, ciśnienie: " + weatherForecast.getPressure() + "hPa");
    }
}
