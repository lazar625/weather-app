package by.lazar.weatherapp.utils;

import by.lazar.weatherapp.utils.current.Weather;
import by.lazar.weatherapp.utils.forecast.Forecast;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


import static java.net.http.HttpClient.Version.HTTP_1_1;

public class HttpReqWeather {
    public Weather reqWeather(String city) throws IOException, InterruptedException {
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .version(HTTP_1_1)
                .uri(URI.create("http://api.weatherapi.com/v1/current.json?key=f61a8cdf8e364060a5c171806250803&q=" + city + "&aqi=no"))
                .build();

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        ObjectMapper objectMapper = new ObjectMapper();
        Weather msk = objectMapper.readValue(response.body(), Weather.class);
        return msk;
    }

    public Forecast getForecast(String city) throws IOException, InterruptedException {
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .version(HTTP_1_1)
                .uri(URI.create("http://api.weatherapi.com/v1/forecast.json?key=f61a8cdf8e364060a5c171806250803&q=" + city + "&days=3&aqi=no&alerts=no"))
                .build();

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(response.body(), Forecast.class);
    }
}
