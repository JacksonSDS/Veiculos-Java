package br.com.magna.sistemas.Veiculos.Eletrico;

import java.util.Objects;

import br.com.magna.sistemas.Veiculos.Modelo.Eletrico;

public class Bonde extends Eletrico {
	
	@Override
	public String toString() {
		return "Sua bateria esta " + getBateria() + "%";

	}
	
	public boolean Bonde(Object obj) {
	    if (obj instanceof Bonde) {
	      Bonde qualquer = (Bonde) obj;
	      return this.getBateria().equals(qualquer.getBateria());
	    }else {
	      return false;
	    }
	  }	 
	
	@Override
	public int hashCode() {
		return Objects.hash(Bateria);
	}

}
