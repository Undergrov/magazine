package com.magazine.market.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    private Info apiInfo() {
        return new Info ( ).title ( "Magazine API" )
                .description ( "API for magazine project" )
                .version ( "0.1.0" )
                .contact ( new Contact ( ).name ( "Andrii Byhar" ).email ( "andriybyhar@gmail.com" ) );
    }

    @Bean
    public OpenAPI openApiConfig(){
        return  new OpenAPI (  ).info ( apiInfo () );
    }
}
