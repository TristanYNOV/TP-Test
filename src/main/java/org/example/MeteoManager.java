package org.example;

public class MeteoManager {
    private final WeatherService weatherService;

    public MeteoManager(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    public String getMeteoMessage(String city) {
        String meteo = weatherService.getCurrentWeather(city);
        return "La météo actuelle à " + city + " est : " + meteo;
    }
}
