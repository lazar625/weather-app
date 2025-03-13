package by.lazar.weatherapp;

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
        HttpResponse<String> response;
        response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        ObjectMapper objectMapper = new ObjectMapper();
        Weather msk = objectMapper.readValue(response.body(), Weather.class);
        return msk;



    }
}
