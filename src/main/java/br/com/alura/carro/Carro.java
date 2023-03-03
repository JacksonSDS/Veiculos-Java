package br.com.alura.carro;

import java.math.BigDecimal;

import br.com.alura.interfaces.TipoInterfaces;

public class Carro {

		private String Placa;
		private String Categoria;
		private Integer Velocidade;
		private String Motor;
		private Integer potencia;
		private Integer VeloMaxima;
		private String Cor;
		private String Assento;
		private Double Pre�o;
		private String Modelo;
		private Integer Ano;
		private Integer Rodas;
		private Double Peso;
		private BigDecimal valor; 
		
		public BigDecimal getValor() {
			return valor;
		}

		public void setValor(BigDecimal valor) {
			this.valor = valor;
		}

		public void accelerar(int aumentar) {
			if (aumentar > 0 && Velocidade + aumentar <= 250) {
				Velocidade += aumentar;
			} else {
				System.out.println("Aumento inv�lido. Deve ser positivo e a velocidade n�o pode exceder 200.");
			}
		}

		public void parar(int dimiinuir) {
			if (dimiinuir > 0 && Velocidade - dimiinuir >= 0) {
				Velocidade -= dimiinuir;
			} else {
				System.out.println("Diminui��o inv�lida. Deve ser positivo e a velocidade n�o pode ser negativa.");
			}
		}

		@Override
		public String toString() {
			return "Veiculo Placa=" + Placa + ", Categoria=" + Categoria + ", Velocidade="
					+ Velocidade + ", Motor=" + Motor + ", potencia=" + potencia + ", VeloMaxima=" + VeloMaxima + ", Cor="
					+ Cor + ", Assento=" + Assento + ", Pre�o=" + Pre�o + ", Modelo=" + Modelo + ", Ano=" + Ano + ", Rodas="
					+ Rodas + ", Peso=" + Peso + "]";
		}

		public BigDecimal calcular(Carro carro, TipoInterfaces tipoInterfaces) {
			return carro.calcular(carro, tipoInterfaces);
		}

}
