package br.com.magna.sistemas.Veiculos.Teste;

import org.junit.jupiter.api.Test;

import br.com.magna.sistemas.Veiculos.Automotor.Caminhao;
import br.com.magna.sistemas.Veiculos.Automotor.Caminhonete;
import br.com.magna.sistemas.Veiculos.Automotor.Carro;
import br.com.magna.sistemas.Veiculos.Automotor.Moto;
import br.com.magna.sistemas.Veiculos.Automotor.Onibus;
import br.com.magna.sistemas.Veiculos.Automotor.Van;
import br.com.magna.sistemas.Veiculos.Eletrico.Bonde;
import br.com.magna.sistemas.Veiculos.Ferroviario.Metro;
import br.com.magna.sistemas.Veiculos.Ferroviario.Trem;
import br.com.magna.sistemas.Veiculos.PropulsaoHumana.Bicicleta;
import br.com.magna.sistemas.Veiculos.TracaoAnimal.Carroca;
import br.com.magna.sistemas.Veiculos.TracaoAnimal.Charrete;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class PrincipalTest {
		
	@Test
	public void VerBicicleta() {
		Bicicleta bi1 = new Bicicleta();
		Bicicleta bi2 = new Bicicleta();
		System.out.println(bi1.equals(bi2));
		System.out.println(bi1.hashCode(bi2));
		
		
		Assert.assertEquals(false, false);
	}
	
	@Test
	public void VerCarro() {
		Carro car1 = new Carro();
		Carro car2 = new Carro();
		System.out.println(car1.equals(car2));
		
		Assert.assertEquals(false, false);
	
	}
	
	@Test
	public void VerCaminhonete() {
		Caminhonete cme1 = new Caminhonete();
		Caminhonete cme2 = new Caminhonete();
		System.out.println(cme1.equals(cme2));
		
		Assert.assertEquals(false, false);
	
	}
	
	@Test
	public void VerCaminhao() {
		Caminhao cam1 = new Caminhao();
		Caminhao cam2 = new Caminhao();
		System.out.println(cam1.equals(cam2));
		
		Assert.assertEquals(false, false);
	
	}
	
	@Test
	public void VerMoto() {
		Moto mt1 = new Moto();
		Moto mt2 = new Moto();
		System.out.println(mt1.equals(mt2));
		
		Assert.assertEquals(false, false);
	
	}
	
	@Test
	public void VerOinibus() {
		Onibus Oni1 = new Onibus();
		Onibus Oni2 = new Onibus();
		System.out.println(Oni1.equals(Oni2));
		
		Assert.assertEquals(false, false);
	
	}
	
	@Test
	public void VerVan() {
		Van V1 = new Van();
		Van V2 = new Van();
		System.out.println(V1.equals(V2));
		
		Assert.assertEquals(false, false);
	
	}
	
	@Test
	public void VerBonde() {
		Bonde Bon1 = new Bonde();
		Bonde Bon2 = new Bonde();
		System.out.println(Bon1.equals(Bon2));
		
		Assert.assertEquals(false, false);
	
	}
	
	@Test
	public void VerMetro() {
		Metro Met1 = new Metro();
		Metro Met2 = new Metro();
		System.out.println(Met1.equals(Met2));
		
		Assert.assertEquals(false, false);
	
	}
	
	@Test
	public void VerTrem() {
		Trem Trm1 = new Trem();
		Trem Trm2 = new Trem();
		System.out.println(Trm1.equals(Trm2));
		
		Assert.assertEquals(false, false);
	
	}
	
	@Test
	public void VerCarroca() {
		Carroca Crr1 = new Carroca();
		Carroca Crr2 = new Carroca();
		System.out.println(Crr1.equals(Crr2));
		
		Assert.assertEquals(false, false);
	
	}
	
	@Test
	public void VerCharrete() {
		Charrete Cha1 = new Charrete();
		Charrete Cha2 = new Charrete();
		System.out.println(Cha1.equals(Cha2));
		
		Assert.assertEquals(false, false);
	
	}
	
}
