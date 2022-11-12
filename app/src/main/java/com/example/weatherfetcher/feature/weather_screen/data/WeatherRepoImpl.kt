package com.example.weatherfetcher.feature.weather_screen.data

class WeatherRepoImpl(private val weatherRemoreSource: WeatherRemoreSource): WeatherRepo {
    override fun getTemperature(): String {
        return weatherRemoreSource.getWeather().message()
    }

}