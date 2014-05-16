
package Model;


class City {
    private String name;
    private String skyCondition;
    private String temperature;
    private String humidity;

    public City(String name, String skyCondition, String temperature, String humidity) {
        this.name = name;
        this.skyCondition = skyCondition;
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public String getName() {
        return name;
    }

    public String getSkyCondition() {
        return skyCondition;
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

    public void setSkyCondition(String skyCondition) {
        this.skyCondition = skyCondition;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }
}
