package br.com.magna.sistemas.Veiculos.Modelo;

public abstract class Ferroviario extends Motorizados {
	private Integer Vagoes;
	private Integer Series;
	private Integer CapacidadeTotal;

	public Integer getVagoes() {
		return Vagoes;
	}

	public void setVagoes(int vagoes) {
		this.Vagoes = vagoes;
	}

	public Integer getSeries() {
		return Series;
	}

	public void setSeries(int series) {
		this.Series = series;
	}

	public Integer getCapacidadeTotal() {
		return CapacidadeTotal;
	}

	public void setCapacidadeTotal(int capacidadeTotal) {
		this.CapacidadeTotal = capacidadeTotal;
	}

}