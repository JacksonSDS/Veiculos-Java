package br.com.magna.sistemas.Veiculos.Modelo;

public abstract class Motorizados extends Veiculos {

	private String Motor;
	private Integer potencia;
	private Integer VeloMaxima;

	public String getMotor() {
		return Motor;
	}

	public void setMotor(String motor) {
		this.Motor = motor;
	}

	public Integer getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public Integer getVeloMaxima() {
		return VeloMaxima;
	}

	public void setVeloMaxima(int veloMaxima) {
		this.VeloMaxima = veloMaxima;
	}

	public String acelerar() {
		return "Veiculo acelerando !!!";
	}

	public String freiar() {
		return "Veiculo freiando !!!";
	}

	public String abrirPorta() {
		return "O veiculo abriu a porta !!!";
	}

	public String fecharPorta() {
		return "O veiculo fechar a porta !!!";
	}

	public String passarMarcha() {
		return "O veiculo passou a marcha !!!";
	}

	@Override
	public String toString() {
		return "Seu motor é:  " + this.Motor + ", A potencia do seu veiculo é: " + this.potencia
				+ ", A velocidade Maxima de seu veiculo: " + this.VeloMaxima;

	}
}
