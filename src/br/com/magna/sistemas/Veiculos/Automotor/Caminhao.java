package br.com.magna.sistemas.Veiculos.Automotor;

import java.util.Objects;

import br.com.magna.sistemas.Veiculos.Interfaces.Carga;
import br.com.magna.sistemas.Veiculos.Modelo.Automotor;

public class Caminhao extends Automotor implements Carga {
	
	@Override
	public String toString() {
		return "Caminhao: " + acelerar() + freiar() + abrirPorta() + fecharPorta() + passarMarcha();
	}	
	public boolean Caminhao(Object obj) {
	    if (obj instanceof Caminhao) {
	      Caminhao qualquer = (Caminhao) obj;
	      return this.getPlaca().equals(qualquer.getPlaca());
	    }else {
	      return false;
	    }
	  }
	
	public int hashCode(Caminhao caminhao) {
		return Objects.hash(Placa);
	}

	public Integer capacidadeCarga = 7500;
	
	@Override
	public Integer mostrarCapacidadeDeCarga() {
		return capacidadeCarga;
	}
	
	

}
