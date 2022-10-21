package it.gianluca;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Occupazione {

	private String occupazione;
	
	public Occupazione(String occ) {
		this.occupazione=occ;
	}
}
