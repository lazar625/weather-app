package by.lazar.weatherapp.utils.forecast;

import by.lazar.weatherapp.utils.current.Location;
import by.lazar.weatherapp.utils.current.Current;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Forecast {
    private Location location;
    private Current current;
    private ForecastData forecast;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }

    public ForecastData getForecast() {
        return forecast;
    }

    public void setForecast(ForecastData forecast) {
        this.forecast = forecast;
    }
}
