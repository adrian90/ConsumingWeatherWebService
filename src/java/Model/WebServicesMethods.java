
package Model;

import WebService.GlobalWeather;
import WebService.GlobalWeatherSoap;


public class WebServicesMethods {

    static String getWeather(java.lang.String cityName, java.lang.String countryName) {
        GlobalWeather service = new GlobalWeather();
        GlobalWeatherSoap port = service.getGlobalWeatherSoap12();
        return port.getWeather(cityName, countryName);
    }

    static String getCitiesByCountry(java.lang.String countryName) {
        GlobalWeather service = new GlobalWeather();
        GlobalWeatherSoap port = service.getGlobalWeatherSoap12();
        return port.getCitiesByCountry(countryName);
    }
}
