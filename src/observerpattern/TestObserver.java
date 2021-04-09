package observerpattern;

public class TestObserver {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionDisplay current = new CurrentConditionDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(60, 60, 29.4f);
		weatherData.setMeasurements(30, 55, 28.4f);
	}

}
