package br.com.alura.interfaces;

import java.math.BigDecimal;

import br.com.alura.carro.Carro;

public class Passageiro implements TipoInterfaces {
	
	public BigDecimal calcular (Carro carro) {
		return carro.getValor().multiply(new BigDecimal("75"));
	}
	
}

