package dev.cfan.getweather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GetWeatherApplication {

    public static void main(String[] args) {
        SpringApplication.run(GetWeatherApplication.class, args);
    }

//    @Bean
//    WeatherClient weatherClient() {
//        WebClient webClient = WebClient.builder()
//            .baseUrl("https://api.open-meteo.com/v1/forecast")
//            .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
//            .build();
//
//        HttpProxy
//    }
}
