package by.lazar.weatherapp.utils.forecast;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ForecastData {
    private List<ForecastDay> forecastday;


} 