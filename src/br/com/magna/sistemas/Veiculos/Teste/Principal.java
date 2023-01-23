package br.com.magna.sistemas.Veiculos.Teste;

import br.com.magna.sistemas.Veiculos.PropulsaoHumana.Bicicleta;

public class Principal {

	public static void main(String[] args) throws Exception {
		Bicicleta bi1 = new Bicicleta();
		Bicicleta bi2 = new Bicicleta();
//		System.out.println(bi1.hashCode() +  " | "  + bi2.hashCode());
		System.out.println(bi1.hashCode());
		System.out.println(bi1.equals(bi2));

	}

}
