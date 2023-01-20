package br.com.magna.sistemas.Veiculos.Automotor;

import br.com.magna.sistemas.Veiculos.Interfaces.Passageiro;
import br.com.magna.sistemas.Veiculos.Modelo.Automotor;

public class Onibus extends Automotor implements Passageiro {	
	
	@Override
	public String toString() {
		return "Onibus: " + acelerar() + freiar() + abrirPorta() + fecharPorta() + passarMarcha();
	}	
	public boolean Onibus(Object obj) {
	    if (obj instanceof Onibus) {
	      Onibus qualquer = (Onibus) obj;
	      return this.getPlaca().equals(qualquer.getPlaca());
	    }else {
	      return false;
	    }
	  }
		
		public Integer MostrarCapacidadeDePassageiro = 75;
		
		@Override
		public Integer MostrarCapacidadeDePassageiro() {
			return MostrarCapacidadeDePassageiro;
		

		}

	}