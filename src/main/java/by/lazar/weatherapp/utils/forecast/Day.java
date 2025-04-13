package by.lazar.weatherapp.utils.forecast;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Day {
    @JsonProperty("maxtemp_c")
    private double maxtempC;
    
    @JsonProperty("maxtemp_f")
    private double maxtempF;
    
    @JsonProperty("mintemp_c")
    private double mintempC;
    
    @JsonProperty("mintemp_f")
    private double mintempF;
    
    @JsonProperty("avgtemp_c")
    private double avgtempC;
    
    @JsonProperty("avgtemp_f")
    private double avgtempF;
    
    @JsonProperty("maxwind_mph")
    private double maxwindMph;
    
    @JsonProperty("maxwind_kph")
    private double maxwindKph;
    
    @JsonProperty("totalprecip_mm")
    private double totalprecipMm;
    
    @JsonProperty("totalprecip_in")
    private double totalprecipIn;
    
    @JsonProperty("totalsnow_cm")
    private double totalsnowCm;
    
    @JsonProperty("avgvis_km")
    private double avgvisKm;
    
    @JsonProperty("avgvis_miles")
    private double avgvisMiles;
    
    private int avghumidity;
    
    @JsonProperty("daily_will_it_rain")
    private int dailyWillItRain;
    
    @JsonProperty("daily_chance_of_rain")
    private int dailyChanceOfRain;
    
    @JsonProperty("daily_will_it_snow")
    private int dailyWillItSnow;
    
    @JsonProperty("daily_chance_of_snow")
    private int dailyChanceOfSnow;
    
    private Condition condition;
    private double uv;


} 