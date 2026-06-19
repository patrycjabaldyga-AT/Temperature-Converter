public class temperatureConverter {

    public double convertCelsiusToFahrenheit(double celsiusTemp){
        return (celsiusTemp * 1.8) + 32;
    }
    public double convertFahrenheitToCelsius(double fahrenheitTemp){
        return (fahrenheitTemp - 32) / 9 * 5;
    }
}
