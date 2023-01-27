package br.com.magna.sistemas.Veiculos.csv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class veiculosInput {
	private static String veiculos;

	public static void main(String[] args) throws IOException {

		InputStream ism = new FileInputStream(
				"C:\\Users\\Jackson\\eclipse-workspace\\Veiculos\\src\\br\\com\\magna\\sistemas\\Veiculos\\csv\\Veiculos.csv");
//		Reader rea = new InputStreamReader(ism, "UTF-8");
//		BufferedReader bfr = new BufferedReader(rea);
		BufferedReader bfr = new BufferedReader(new InputStreamReader(ism, "UTF-8"));

		OutputStream fos = new FileOutputStream(
				"C:\\Users\\Jackson\\eclipse-workspace\\Veiculos\\src\\br\\com\\magna\\sistemas\\Veiculos\\csv\\Veiculos.txt");
		Writer osw = new OutputStreamWriter(fos, "UTF-8");
		BufferedWriter bfw = new BufferedWriter(osw);

		String linha = bfr.readLine();

		while (linha != null) {
			bfw.write(linha);
			bfw.newLine();
			linha = bfr.readLine();
		}

		bfr.close();
		bfw.close();
		
		}
	}