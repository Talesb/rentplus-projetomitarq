package br.com.rentplus.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "moto")
public class Moto extends Veiculo {

	private int cilindradas;

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}


	
}
