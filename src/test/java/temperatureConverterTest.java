import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class temperatureConverterTest {

    @Test
    void checkConvertToFahrenheit() {
        temperatureConverter calc = new temperatureConverter();
        assertEquals(32.0, calc.convertCelsiusToFahrenheit(0));
    }

    @Test
    void checkConvertToCelsius(){
        temperatureConverter calc = new temperatureConverter();
        assertEquals(0.0, calc.convertFahrenheitToCelsius(32.0));
    }
}