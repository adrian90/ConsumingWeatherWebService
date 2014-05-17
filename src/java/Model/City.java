
package Model;


public class City {
    private String name;
    private String visibility;
    private String temperature;
    private String humidity;
    private String country;

    public City() {
    }

    public City(String name, String visibility, String temperature, String humidity, String country) {
        this.name = name;
        this.visibility = visibility;
        this.temperature = temperature;
        this.humidity = humidity;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }
    
    public String getVisibility() {
        return visibility;
    }

    public String getTemperature() {
        return temperature;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }
}
