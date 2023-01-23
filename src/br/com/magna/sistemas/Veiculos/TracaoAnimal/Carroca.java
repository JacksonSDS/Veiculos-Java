package br.com.magna.sistemas.Veiculos.TracaoAnimal;

import java.util.Objects;

import br.com.magna.sistemas.Veiculos.Modelo.TracaoAnimal;

public class Carroca extends TracaoAnimal {
	
	@Override
	public String toString() {
		return "Carroça: " + puxarCorda() + guiar();
	}
	
	public boolean Carroca(Object obj) {
	    if (obj instanceof Carroca) {
	      Carroca qualquer = (Carroca) obj;
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
