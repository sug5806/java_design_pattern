public class StatisticsDisplay implements Observer, DisplayElement {
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum= 0.0f;
    private int numReadings;
    private final WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void display() {
        System.out.println("평균/최고/최저 기온 = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }

    @Override
    public void update() {
        tempSum += this.weatherData.getTemperature();
        numReadings++;

        if (this.weatherData.getTemperature() > maxTemp) {
            maxTemp = this.weatherData.getTemperature();
        }

        if (this.weatherData.getTemperature() < minTemp) {
            minTemp = this.weatherData.getTemperature();
        }

        display();
    }
}
