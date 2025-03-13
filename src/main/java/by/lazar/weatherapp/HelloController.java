package by.lazar.weatherapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import java.io.IOException;


public class HelloController {

    HttpReqWeather req = new HttpReqWeather();

    @FXML
    private ImageView imagCloud;

    @FXML
    private TextField cityText;

    @FXML
    private Text mainText;


    @FXML
    private Button searchBtn;

    @FXML
    private Text tempText;

    @FXML
    private Text wind;

    @FXML
    private Text feels;

    @FXML
    private ImageView cicon;

    @FXML
    void onBtnClick(ActionEvent event) throws IOException, InterruptedException {
        Weather weather = req.reqWeather(cityText.getText());
        if (weather.getCurrent() == null) {
            mainText.setText("No weather found! Wrong Place!");
            return;
        }
        mainText.setText(cityText.getText());
        int tmp = (int) weather.getCurrent().getTemp_c();
        if (tmp>0) {
            tempText.setText("+" + tmp);
        }
        else {
            tempText.setText(String.valueOf(tmp));
        }

        cicon.setImage(new Image("C:\\Users\\lazar\\IdeaProjects\\weather-app\\src\\main\\resources\\images\\1530373_weather_forecast_temperature_thermometer_icon.png"));

        switch (weather.getCurrent().getCondition().getText()){
            case ("Sunny"): imagCloud.setImage(new Image("C:\\Users\\lazar\\IdeaProjects\\weather-app\\src\\main\\resources\\images\\2682848_day_forecast_sun_sunny_weather_icon.png"));
            break;

            case ("Partly cloudy"): imagCloud.setImage(new Image("C:\\Users\\lazar\\IdeaProjects\\weather-app\\src\\main\\resources\\images\\2682849_cloud_cloudy_day_forecast_sun_icon.png"));
            break;


        }

        wind.setText("Ветер : " + String.valueOf(weather.getCurrent().getWind_kph()) + " км/ч");

        feels.setText("Ощущается как : " + String.valueOf((int) weather.getCurrent().getFeelslike_c()) + " C");




    }



}