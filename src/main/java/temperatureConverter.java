public class temperatureConverter {

    static void main() {
        System.out.println(convertCelsiusToFahrenheit(-100));
        System.out.println(convertFahrenheitToCelsius(32.0));
    }

    public static double convertCelsiusToFahrenheit(double celsiusTemp){
            double fahrenheitTemp = (celsiusTemp * 1.8) + 32;
            return fahrenheitTemp;
    }
    public static double convertFahrenheitToCelsius(double fahrenheitTemp){
            double celsiusTemp = (fahrenheitTemp - 32) / 9 * 5;
            return celsiusTemp;
    }
}
