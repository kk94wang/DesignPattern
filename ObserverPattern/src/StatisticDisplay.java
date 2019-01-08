public class StatisticDisplay implements Observer, DisplayElement {
    private float maxTemp = 0f;
    private float minTemp = 200f;
    private float sumTemp = 0;
    private int count = 0;
    private WeatherData weatherData;

    StatisticDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (sumTemp / count)
                + "/" + maxTemp + "/" + minTemp);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        sumTemp += temp;
        count ++;

        if (temp > maxTemp) {
            maxTemp = temp;
        }

        if (temp < minTemp) {
            minTemp = temp;
        }

        display();
    }
}
