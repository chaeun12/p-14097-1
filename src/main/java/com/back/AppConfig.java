package com.back;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class AppConfig {
    @Bean
    PersonRepository personRepository() {
        return new PersonRepository(1);
    }

    @Bean
    PersonRepository personRepositoryV2() {
        return new PersonRepository(2);
    }

}