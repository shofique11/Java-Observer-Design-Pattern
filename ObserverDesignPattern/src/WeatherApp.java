//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class WeatherApp {
    public static void main(String[] args) {
      WeatherStation weatherStation = new WeatherStation();
      Observer phoneDisplay = new PhoneDisplay();
      weatherStation.registerObserver(phoneDisplay);
      Observer tvDisplay = new TvDisplay();
      weatherStation.registerObserver(tvDisplay);
      weatherStation.setWeather("Sunny");
    }
}