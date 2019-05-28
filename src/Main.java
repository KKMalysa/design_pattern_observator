import notification.InternetNews;
import notification.RadioNews;
import notification.TvNews;
import weatherForecast.WeatherForecast;

public class Main {

    public static void main(String[] args) {

        WeatherForecast weatherForecast = new WeatherForecast(18, 1020);

        RadioNews radioNews = new RadioNews();
        TvNews tvNews = new TvNews();
        InternetNews internetNews = new InternetNews();

        weatherForecast.registerObserver(radioNews);
        weatherForecast.registerObserver(internetNews);
        weatherForecast.registerObserver(tvNews);
        weatherForecast.notifyObservers();
        weatherForecast.unregisterObserver(tvNews);
        weatherForecast.unregisterObserver(radioNews);
        System.out.println("----------------------------------");
        System.out.println("pogoda tylko dla serwisu internetowego");
        weatherForecast.updateWeatherForecast(weatherForecast);
        System.out.println("----------------------------------");
    }
}
