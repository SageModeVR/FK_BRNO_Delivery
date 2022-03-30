package com.example.modeldelivery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ModelDeliveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModelDeliveryApplication.class, args);
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/GLTF/*").allowedOrigins("https://bdu-configurator.herokuapp.com", "https://dev-configurator.herokuapp.com");
            }
        };
    }
}
