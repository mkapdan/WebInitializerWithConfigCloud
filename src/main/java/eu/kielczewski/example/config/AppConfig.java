package eu.kielczewski.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@ComponentScan(basePackages = "eu.kielczewski.example")
@PropertySources({@PropertySource("classpath:appConfigCloud.properties"),
@PropertySource("classpath:git.properties")})
class AppConfig {
}