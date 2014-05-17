package Model;

import org.junit.Test;

public class ParserTests {

    @Test
    public void TestParserOfCountries() {
        Country country = ParseCountry.getListCity("Spain");
        System.out.println(country.getName());
        for (City city : country.getCities()) {
            System.out.println(city.getName());
        }
    }

    @Test
    public void TestParserOfCities() {
        City city = ParseCity.getWeatherCity("Fuerteventura", "Spain");
        System.out.println("Name: " + city.getName() + "\n" + "Humidity: " + city.getHumidity() + "\n"
                + "Temperature: " + city.getTemperature() + "\n" + "Visibility: " + city.getVisibility());
    }
}
