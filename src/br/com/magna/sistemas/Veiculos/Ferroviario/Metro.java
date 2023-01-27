package br.com.magna.sistemas.Veiculos.Ferroviario;

import java.util.Objects;

import br.com.magna.sistemas.Veiculos.Modelo.Ferroviario;

public class Metro extends Ferroviario {
	
	@Override
	public String toString() {
		return "Metro: " + acelerar() + freiar() + abrirPorta() + fecharPorta() + passarMarcha();
	}	
	public boolean Metro(Object obj) {
	    if (obj instanceof Metro) {
	      Metro M1 = (Metro) obj;
	      return this.getSeries().equals(M1.getSeries());
	    }else {
	      return false;
	    }
	  }
	
	public int hashCode(Ferroviario metro) {
		return Objects.hash(Series);
	}
	

}


