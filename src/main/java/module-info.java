module by.lazar.weatherapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.fasterxml.jackson.databind;
    requires java.net.http;
    requires static lombok;

    opens by.lazar.weatherapp to javafx.fxml;
    exports by.lazar.weatherapp;
    exports by.lazar.weatherapp.utils.current;
    exports by.lazar.weatherapp.utils.forecast;
    exports by.lazar.weatherapp.utils;
    opens by.lazar.weatherapp.utils to javafx.fxml;
}