package br.com.magna.sistemas.Veiculos.PropulsaoHumana;

import java.util.Objects;

import br.com.magna.sistemas.Veiculos.Modelo.PropulsaoHumana;

public class Bicicleta extends PropulsaoHumana {

	@Override
	public String toString() {
		return "Bicicleta: " + pedalar() + "," + freiar() + ","+ conduzir() + "," + equilibrar();
	}	
	
		public boolean Bi1(Object Bi2) {
		    if (Bi2 instanceof Bicicleta) {
		      Bicicleta Bi1 = (Bicicleta) Bi2;
		      return this.getCor().equals(Bi1.getCor());
		    }else {
		      return false;
		    }
		  }
	
	public int hashCode(PropulsaoHumana bicicleta) {
		return Objects.hash(ForcaFisica);
	}		
	
}
