package by.lazar.weatherapp;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@ToString
public class Current {
    private double temp_c;
    private double feelslike_c;
    private double wind_kph;
    private Condition condition;
}
