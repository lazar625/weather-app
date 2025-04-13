package by.lazar.weatherapp.utils.forecast;

import by.lazar.weatherapp.utils.current.Location;
import by.lazar.weatherapp.utils.current.Current;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Forecast {
    private Location location;
    private Current current;
    private ForecastData forecast;


}
