package Model;

import org.junit.Test;

public class ParserTests {

    @Test
    public void TestParserOfCountries() {
        ParseCountry parser = new ParseCountry();
        Country country = parser.getListCity("Spain");
        System.out.println(country.getName());
        for (City city : country.getCities()) {
            System.out.println(city.getName());
        }
    }

    @Test
    public void TestParserOfCities() {
        ParseCity parser = new ParseCity();
        City city = parser.getWeatherCity("Fuerteventura", "Spain");
        System.out.println("Name: " + city.getName() + "\n" + "Humidity: " + city.getHumidity() + "\n"
                + "Temperature: " + city.getTemperature() + "\n" + "Visibility: " + city.getVisibility());
    }
}
