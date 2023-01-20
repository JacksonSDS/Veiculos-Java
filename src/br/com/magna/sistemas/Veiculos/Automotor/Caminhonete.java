package br.com.magna.sistemas.Veiculos.Automotor;

import br.com.magna.sistemas.Veiculos.Interfaces.Carga;
import br.com.magna.sistemas.Veiculos.Modelo.Automotor;

public class Caminhonete extends Automotor implements Carga {
	
	@Override
	public String toString() {
		return "Caminhonete: " + acelerar() + freiar() + abrirPorta() + fecharPorta() + passarMarcha();
	}	
	public boolean Caminhonete(Object obj) {
	    if (obj instanceof Caminhonete) {
	      Caminhonete qualquer = (Caminhonete) obj;
	      return this.getPlaca().equals(qualquer.getPlaca());
	    }else {
	      return false;
	    }
	  }

	public Integer capacidadeCarga = 1000;

	@Override
	public Integer mostrarCapacidadeDeCarga() {
		return capacidadeCarga;
	}

}
