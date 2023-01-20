package br.com.magna.sistemas.Veiculos.Automotor;

import br.com.magna.sistemas.Veiculos.Interfaces.Carga;
import br.com.magna.sistemas.Veiculos.Interfaces.Passageiro;
import br.com.magna.sistemas.Veiculos.Modelo.Automotor;

public class Carro extends Automotor implements Passageiro, Carga {
	
	@Override
	public String toString() {
		return "Carro: " + acelerar() + freiar() + abrirPorta() + fecharPorta() + passarMarcha();
	}	
	public boolean Carro(Object obj) {
	    if (obj instanceof Carro) {
	      Carro qualquer = (Carro) obj;
	      return this.getPlaca().equals(qualquer.getPlaca());
	    }else {
	      return false;
	    }
	  }

	public Integer MostrarCapacidadeDePassageiro = 4;
	
	@Override
	public Integer MostrarCapacidadeDePassageiro() {
		return MostrarCapacidadeDePassageiro;
	}	
		
public Integer capacidadeCarga = 700;

	@Override
	public Integer mostrarCapacidadeDeCarga() {
		return capacidadeCarga;
	}


}