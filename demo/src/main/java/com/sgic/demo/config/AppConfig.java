package com.sgic.demo.config;

import com.sgic.demo.entity.Demo;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

    @Bean//object managements
    @Qualifier("first")
    public Demo firstBean(){
        return  new Demo("Hello");
    }
    @Bean
    @Primary
    public Demo secondBean(){
        return new Demo("Hello");
    }

    @Configuration
    public static class OpenApiConfig {
        @Bean
        public OpenAPI customOpenAPI(){
            return new OpenAPI()
                    .info(new Info()
                            .title("Student Mangement")
                            .version("1.0")
                            .description("Student_profile"));
        }
    }
}
