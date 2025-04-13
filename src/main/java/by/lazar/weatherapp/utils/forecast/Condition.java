package by.lazar.weatherapp.utils.forecast;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Condition {
    private String text;
    private String icon;
    private int code;


} 