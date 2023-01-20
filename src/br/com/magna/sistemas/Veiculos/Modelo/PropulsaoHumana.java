package br.com.magna.sistemas.Veiculos.Modelo;

import java.util.Objects;

public abstract class PropulsaoHumana extends Veiculos {
	
	protected Integer ForcaFisica;

	public Integer getForçaFisica() {
		return ForcaFisica;
	}

	public void setForçaFisica(int forçaFisica) {
		this.ForcaFisica = forçaFisica;
	}
	
	public String pedalar() {
		return  "Você esta pedalando";
    }
	
	public String freiar() {
		return "Você esta freiando";
    }
	
	public String conduzir() {
		return "Você esta conduzizando seu veiculo";
    }
	
	public String equilibrar() {
        return "Você esta equilibrado";
    }
	
}
