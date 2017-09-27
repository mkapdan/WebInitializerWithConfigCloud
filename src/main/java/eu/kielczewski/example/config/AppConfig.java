package eu.kielczewski.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan(basePackages = "eu.kielczewski.example")
@PropertySource("classpath:appConfigCloud.properties")
class AppConfig {

}