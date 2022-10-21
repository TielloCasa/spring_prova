package it.gianluca;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.ToString;

@Component
@Data
@ToString
public class Persona {

	Occupazione occupazione;
	static private String nome="Gino";
	static private String cognome="astrubale";
	
	public Persona(Occupazione occ) {
		this.occupazione=occ;
	}
	
}
