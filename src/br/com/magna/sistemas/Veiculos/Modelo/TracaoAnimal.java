package br.com.magna.sistemas.Veiculos.Modelo;

public abstract class TracaoAnimal extends Veiculos {

	protected Integer QuantidadeAnimal;
	private String TipoAnimal;

	public Integer getQuantidadeAnimal() {
		return QuantidadeAnimal;
	}

	public void setQuantidadeAnimal(int quantidadeAnimal) {
		this.QuantidadeAnimal = quantidadeAnimal;
	}

	public String getTipoAnimal() {
		return TipoAnimal;
	}

	public void setTipoAnimal(String tipoAnimal) {
		this.TipoAnimal = tipoAnimal;
	}

	public String puxarCorda() {
		return "Você esta puxando a corda do seu veiculo ";
	}

	public String guiar() {
		return "Você esta guiando seu veiculo";
	}
	
}
