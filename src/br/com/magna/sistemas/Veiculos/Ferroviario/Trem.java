package br.com.magna.sistemas.Veiculos.Ferroviario;

import java.util.Objects;

import br.com.magna.sistemas.Veiculos.Modelo.Ferroviario;

public class Trem extends Ferroviario {
	
	@Override
	public String toString() {
		return "Trem; " + acelerar() + freiar() + abrirPorta() + fecharPorta() + passarMarcha();
	}	
	public boolean Trem(Object obj) {
	    if (obj instanceof Trem) {
	      Trem qualquer = (Trem) obj;
	      return this.getSeries().equals(qualquer.getSeries());
	    }else {
	      return false;
	    }
	  }
	
	@Override
	public int hashCode() {
		return Objects.hash(Series);
	}
	

}
