package br.com.magna.sistemas.Veiculos.Modelo;

public class Veiculos {
	private String Cor;
	private String Assento;
	private double Preço;
	private String Modelo;
	private Integer Ano;
	private Integer Rodas;
	private double Peso;

	public String getCor() {
		return Cor;
	}

	public void setCor(String cor) {
		this.Cor = cor;
	}

	public String getAssento() {
		return Assento;
	}

	public void setAssento(String assento) {
		this.Assento = assento;
	}

	public double getPreço() {
		return Preço;
	}

	public void setPreço(double preço) {
		this.Preço = preço;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		this.Modelo = modelo;
	}

	public Integer getAno() {
		return Ano;
	}

	public void setAno(int ano) {
		this.Ano = ano;
	}

	public Integer getRodas() {
		return Rodas;
	}

	public void setRodas(int rodas) {
		Rodas = rodas;
	}

	public double getPeso() {
		return Peso;
	}

	public void setPeso(double peso) {
		Peso = peso;
	}

	@Override
	public String toString() {
		return "Cor:" + this.Cor + ", assentos" + this.Assento + ", Preço: " + this.Preço + ", Modelo: " + this.Modelo
				+ ", Ano: " + this.Ano + ", Rodas: " + this.Rodas + ", Peso: " + this.Peso;

	}
}