package br.com.magna.sistemas.Veiculos.Automotor;

import java.util.Objects;

import br.com.magna.sistemas.Veiculos.Interfaces.Passageiro;
import br.com.magna.sistemas.Veiculos.Modelo.Automotor;

public class Moto extends Automotor implements Passageiro {
	
	@Override
	public String toString() {
		return "Caminhao: " + acelerar() + freiar() + abrirPorta() + fecharPorta() + passarMarcha();
	}	
	public boolean Moto(Object obj) {
	    if (obj instanceof Moto) {
	      Moto qualquer = (Moto) obj;
	      return this.getPlaca().equals(qualquer.getPlaca());
	    }else {
	      return false;
	    }
	  }
	
	public int hashCode(Automotor moto) {
		return Objects.hash(Placa);
	}
	
public Integer MostrarCapacidadeDePassageiro = 2;
	
	@Override
	public Integer MostrarCapacidadeDePassageiro() {
		return MostrarCapacidadeDePassageiro;
		
	}
}