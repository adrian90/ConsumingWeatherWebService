
package Model;


class City {
    private String name;
    private String visibility;
    private String temperature;
    private String humidity;

    public City() {
    }

    public City(String name, String visibility, String temperature, String humidity) {
        this.name = name;
        this.visibility = visibility;
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public String getName() {
        return name;
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

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }
}
