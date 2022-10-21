package it.gianluca;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = Persona.class)
public class Config {
	
	@Bean
	public Occupazione getOccupazione() {
		return new Occupazione("Trasportatore");
	}

}
