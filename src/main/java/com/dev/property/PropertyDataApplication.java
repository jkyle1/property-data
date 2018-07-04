package com.dev.property;

import com.dev.property.domain.interfaces.UploadService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

    @SpringBootApplication
    @EnableJpaRepositories
    public class PropertyDataApplication {

        public static void main(String[] args) {
            SpringApplication.run(PropertyDataApplication.class, args);
        }

        @Bean
        CommandLineRunner init(UploadService uploadService) {
            return (args) -> {
                uploadService.deleteAll();
                uploadService.init();
            };
        }
    }