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
		private Double Preço;
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
				System.out.println("Aumento inválido. Deve ser positivo e a velocidade não pode exceder 200.");
			}
		}

		public void parar(int dimiinuir) {
			if (dimiinuir > 0 && Velocidade - dimiinuir >= 0) {
				Velocidade -= dimiinuir;
			} else {
				System.out.println("Diminuição inválida. Deve ser positivo e a velocidade não pode ser negativa.");
			}
		}

		@Override
		public String toString() {
			return "Veiculo Placa=" + Placa + ", Categoria=" + Categoria + ", Velocidade="
					+ Velocidade + ", Motor=" + Motor + ", potencia=" + potencia + ", VeloMaxima=" + VeloMaxima + ", Cor="
					+ Cor + ", Assento=" + Assento + ", Preço=" + Preço + ", Modelo=" + Modelo + ", Ano=" + Ano + ", Rodas="
					+ Rodas + ", Peso=" + Peso + "]";
		}

		public BigDecimal calcular(Carro carro, TipoInterfaces tipoInterfaces) {
			return carro.calcular(carro, tipoInterfaces);
		}

}
