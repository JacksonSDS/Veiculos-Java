package br.com.magna.sistemas.Veiculos.Automotor;

import java.util.Objects;

import br.com.magna.sistemas.Veiculos.Interfaces.Carga;
import br.com.magna.sistemas.Veiculos.Interfaces.Passageiro;
import br.com.magna.sistemas.Veiculos.Modelo.Automotor;

public class Van extends Automotor implements Passageiro, Carga {
	
	@Override
	public String toString() {
		return "Van: " + acelerar() + freiar() + abrirPorta() + fecharPorta() + passarMarcha();
	}	
	public boolean Van(Object obj) {
	    if (obj instanceof Van) {
	      Van qualquer = (Van) obj;
	      return this.getPlaca().equals(qualquer.getPlaca());
	    }else {
	      return false;
	    }
	  }
	
	@Override
	public int hashCode() {
		return Objects.hash(Placa);
	}
	
	public Integer MostrarCapacidadeDePassageiro = 15;
	
	@Override
	public Integer MostrarCapacidadeDePassageiro() {
		return MostrarCapacidadeDePassageiro;
	}	
		
public Integer capacidadeCarga = 1200;

	@Override
	public Integer mostrarCapacidadeDeCarga() {
		return capacidadeCarga;
	}


}
