package dev.cfan.getweather.Controls;


import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class GetWeather {

    
    @ShellMethod("Get the current weather for a specified city.")
    public String getWeather(@ShellOption String city) {
        // https://api.open-meteo.com/v1/forecast?latitude=41.8781&longitude=87.6298&hourly=temperature_2m&temperature_unit=fahrenheit&precipitation_unit=inch&timezone=America%2FChicago
        // return the result of the API call above
        return "The weather in " + city + " is 72 degrees.";

    }

    
}
