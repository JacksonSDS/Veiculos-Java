package br.com.magna.sistemas.Veiculos.Modelo;

public abstract class Eletrico extends Motorizados {

	protected Integer Bateria;

	public Integer getBateria() {
		return Bateria;
	}

	public void setBateria(int bateria) {
		this.Bateria = bateria;
	}

}
