package by.lazar.weatherapp.utils.current;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Current {
    @JsonProperty("last_updated_epoch")
    private long lastUpdatedEpoch;
    
    @JsonProperty("last_updated")
    private String lastUpdated;
    
    @JsonProperty("temp_c")
    private double tempC;
    
    @JsonProperty("temp_f")
    private double tempF;
    
    @JsonProperty("is_day")
    private int isDay;
    
    private Condition condition;
    
    @JsonProperty("wind_mph")
    private double windMph;
    
    @JsonProperty("wind_kph")
    private double windKph;
    
    @JsonProperty("wind_degree")
    private int windDegree;
    
    @JsonProperty("wind_dir")
    private String windDir;
    
    @JsonProperty("pressure_mb")
    private double pressureMb;
    
    @JsonProperty("pressure_in")
    private double pressureIn;
    
    @JsonProperty("precip_mm")
    private double precipMm;
    
    @JsonProperty("precip_in")
    private double precipIn;
    
    private int humidity;
    private int cloud;
    
    @JsonProperty("feelslike_c")
    private double feelslikeC;
    
    @JsonProperty("feelslike_f")
    private double feelslikeF;
    
    @JsonProperty("windchill_c")
    private double windchillC;
    
    @JsonProperty("windchill_f")
    private double windchillF;
    
    @JsonProperty("heatindex_c")
    private double heatindexC;
    
    @JsonProperty("heatindex_f")
    private double heatindexF;
    
    @JsonProperty("dewpoint_c")
    private double dewpointC;
    
    @JsonProperty("dewpoint_f")
    private double dewpointF;
    
    @JsonProperty("vis_km")
    private double visKm;
    
    @JsonProperty("vis_miles")
    private double visMiles;
    
    private double uv;
    
    @JsonProperty("gust_mph")
    private double gustMph;
    
    @JsonProperty("gust_kph")
    private double gustKph;

    // Геттеры и сеттеры
    public long getLastUpdatedEpoch() {
        return lastUpdatedEpoch;
    }

    public void setLastUpdatedEpoch(long lastUpdatedEpoch) {
        this.lastUpdatedEpoch = lastUpdatedEpoch;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public double getTempC() {
        return tempC;
    }

    public void setTempC(double tempC) {
        this.tempC = tempC;
    }

    public double getTempF() {
        return tempF;
    }

    public void setTempF(double tempF) {
        this.tempF = tempF;
    }

    public int getIsDay() {
        return isDay;
    }

    public void setIsDay(int isDay) {
        this.isDay = isDay;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public double getWindMph() {
        return windMph;
    }

    public void setWindMph(double windMph) {
        this.windMph = windMph;
    }

    public double getWindKph() {
        return windKph;
    }

    public void setWindKph(double windKph) {
        this.windKph = windKph;
    }

    public int getWindDegree() {
        return windDegree;
    }

    public void setWindDegree(int windDegree) {
        this.windDegree = windDegree;
    }

    public String getWindDir() {
        return windDir;
    }

    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    public double getPressureMb() {
        return pressureMb;
    }

    public void setPressureMb(double pressureMb) {
        this.pressureMb = pressureMb;
    }

    public double getPressureIn() {
        return pressureIn;
    }

    public void setPressureIn(double pressureIn) {
        this.pressureIn = pressureIn;
    }

    public double getPrecipMm() {
        return precipMm;
    }

    public void setPrecipMm(double precipMm) {
        this.precipMm = precipMm;
    }

    public double getPrecipIn() {
        return precipIn;
    }

    public void setPrecipIn(double precipIn) {
        this.precipIn = precipIn;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getCloud() {
        return cloud;
    }

    public void setCloud(int cloud) {
        this.cloud = cloud;
    }

    public double getFeelslikeC() {
        return feelslikeC;
    }

    public void setFeelslikeC(double feelslikeC) {
        this.feelslikeC = feelslikeC;
    }

    public double getFeelslikeF() {
        return feelslikeF;
    }

    public void setFeelslikeF(double feelslikeF) {
        this.feelslikeF = feelslikeF;
    }

    public double getWindchillC() {
        return windchillC;
    }

    public void setWindchillC(double windchillC) {
        this.windchillC = windchillC;
    }

    public double getWindchillF() {
        return windchillF;
    }

    public void setWindchillF(double windchillF) {
        this.windchillF = windchillF;
    }

    public double getHeatindexC() {
        return heatindexC;
    }

    public void setHeatindexC(double heatindexC) {
        this.heatindexC = heatindexC;
    }

    public double getHeatindexF() {
        return heatindexF;
    }

    public void setHeatindexF(double heatindexF) {
        this.heatindexF = heatindexF;
    }

    public double getDewpointC() {
        return dewpointC;
    }

    public void setDewpointC(double dewpointC) {
        this.dewpointC = dewpointC;
    }

    public double getDewpointF() {
        return dewpointF;
    }

    public void setDewpointF(double dewpointF) {
        this.dewpointF = dewpointF;
    }

    public double getVisKm() {
        return visKm;
    }

    public void setVisKm(double visKm) {
        this.visKm = visKm;
    }

    public double getVisMiles() {
        return visMiles;
    }

    public void setVisMiles(double visMiles) {
        this.visMiles = visMiles;
    }

    public double getUv() {
        return uv;
    }

    public void setUv(double uv) {
        this.uv = uv;
    }

    public double getGustMph() {
        return gustMph;
    }

    public void setGustMph(double gustMph) {
        this.gustMph = gustMph;
    }

    public double getGustKph() {
        return gustKph;
    }

    public void setGustKph(double gustKph) {
        this.gustKph = gustKph;
    }
}
