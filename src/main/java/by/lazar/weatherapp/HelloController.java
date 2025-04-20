package by.lazar.weatherapp;

import by.lazar.weatherapp.utils.HttpReqWeather;
import by.lazar.weatherapp.utils.current.Weather;
import by.lazar.weatherapp.utils.forecast.Forecast;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

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
    private Text day1;
    @FXML
    private Text day2;
    @FXML
    private Text day3;
    @FXML
    private Text temp1;
    @FXML
    private Text temp2;
    @FXML
    private Text temp3;
    @FXML
    private ImageView icon1;
    @FXML
    private ImageView icon2;
    @FXML
    private ImageView icon3;

    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE", new Locale("ru"));

    @FXML
    void onBtnClick(ActionEvent event) throws IOException, InterruptedException {
        String city = cityText.getText();
        

        Weather weather = req.reqWeather(city);
        if (weather.getCurrent() == null) {
            mainText.setText("Город не найден!");
            return;
        }
        

        mainText.setText(city);
        int tmp = (int) weather.getCurrent().getTempC();
        tempText.setText(tmp > 0 ? "+" + tmp : String.valueOf(tmp));
        


        switch (weather.getCurrent().getCondition().getText()) {
            case "Sunny":
                imagCloud.setImage(new Image( System.getProperty("user.dir")+"\\src\\main\\resources\\images\\2682848_day_forecast_sun_sunny_weather_icon.png"));
                break;
            case "Partly cloudy":
                imagCloud.setImage(new Image(System.getProperty("user.dir")+"src\\main\\resources\\images\\2682849_cloud_cloudy_day_forecast_sun_icon.png"));
                break;
        }

        wind.setText(String.valueOf(weather.getCurrent().getWindKph()) + " км/ч");
        feels.setText(String.valueOf((int) weather.getCurrent().getFeelslikeC()) + " C");


        try {

            Forecast forecast = req.getForecast(city);

            
            if (forecast != null && forecast.getForecast() != null) {

                
                if (forecast.getForecast().getForecastday() != null && forecast.getForecast().getForecastday().size() >= 3) {

                    LocalDate date1 = LocalDate.parse(forecast.getForecast().getForecastday().get(0).getDate());
                    day1.setText("Сегодня ");
                    temp1.setText(String.valueOf((int) forecast.getForecast().getForecastday().get(0).getDay().getAvgtempC()) + "°C");
                    updateForecastIcon(icon1, forecast.getForecast().getForecastday().get(0).getDay().getCondition().getText());



                    LocalDate date2 = LocalDate.parse(forecast.getForecast().getForecastday().get(1).getDate());
                    day2.setText("Завтра");
                    temp2.setText(String.valueOf((int) forecast.getForecast().getForecastday().get(1).getDay().getAvgtempC()) + "°C");
                    updateForecastIcon(icon2, forecast.getForecast().getForecastday().get(1).getDay().getCondition().getText());



                    LocalDate date3 = LocalDate.parse(forecast.getForecast().getForecastday().get(2).getDate());
                    day3.setText("Послезавтра");
                    temp3.setText(String.valueOf((int) forecast.getForecast().getForecastday().get(2).getDay().getAvgtempC()) + "°C");
                    updateForecastIcon(icon3, forecast.getForecast().getForecastday().get(2).getDay().getCondition().getText());

                } else {
                    throw new RuntimeException();
                }
            }
        } catch (Exception e) {
            System.out.println("Ошибка при получении прогноза: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void updateForecastIcon(ImageView icon, String condition) {
        switch (condition) {
            case "Sunny":
                icon.setImage(new Image(System.getProperty("user.dir")+"\\src\\main\\resources\\images\\2682848_day_forecast_sun_sunny_weather_icon.png"));
                break;
            case "Partly cloudy":
                icon.setImage(new Image(System.getProperty("user.dir")+"\\src\\main\\resources\\images\\2682849_cloud_cloudy_day_forecast_sun_icon.png"));
                break;
            default:
                icon.setImage(new Image(System.getProperty("user.dir")+"\\src\\main\\resources\\images\\2682849_cloud_cloudy_day_forecast_sun_icon.png"));
                break;
        }
    }
}