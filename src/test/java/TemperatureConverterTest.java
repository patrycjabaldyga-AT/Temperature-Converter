import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    @Test
    void checkConvertFromCelsiusToFahrenheitTest() {

        //Arrange:
        temperatureConverter converter = new temperatureConverter();
        int celsiusTemp = 0;

        //Act:
        double result = converter.convertCelsiusToFahrenheit(celsiusTemp);
        double expected = 32.0;

        //Assert:
        assertEquals(expected,result);
    }

    @Test
    void checkConvertFromFahrenheitToCelsiusTest(){

        //Arrange:
        temperatureConverter converter = new temperatureConverter();
        double fahrenheitTemp = 32.0;

        //Act:
        double result = converter.convertFahrenheitToCelsius(fahrenheitTemp);
        double expected = 0.0;

        //Assert:
        assertEquals(expected, result);
    }
}