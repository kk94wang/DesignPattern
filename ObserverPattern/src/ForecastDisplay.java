public class ForecastDisplay implements Observer, DisplayElement {
    private WeatherData weatherData;
    private float lastPress;
    private float currentPress = 29.2f;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.print("Forecast: ");
        if (currentPress > lastPress) {
            System.out.println("Improving weather on the way!");
        } else if (currentPress == lastPress) {
            System.out.println("More of the same");
        } else if (currentPress < lastPress) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        lastPress = currentPress;
        currentPress = pressure;
        display();
    }
}
