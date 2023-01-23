package br.com.magna.sistemas.Veiculos.TracaoAnimal;

import java.util.Objects;

import br.com.magna.sistemas.Veiculos.Modelo.TracaoAnimal;

public class Charrete extends TracaoAnimal {
	
	@Override
	public String toString() {
		return "Charrete: " + puxarCorda() + guiar();
	}
	
	public boolean Charrete(Object obj) {
	    if (obj instanceof Charrete) {
	      Charrete qualquer = (Charrete) obj;
	      return this.puxarCorda().equals(qualquer.puxarCorda());
	    }else {
	      return false;
	    }
	  }
	
	@Override
	public int hashCode() {
		return Objects.hash(QuantidadeAnimal);
	}
	
}
