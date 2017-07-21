package br.com.andreguedes.romanos;

import java.util.HashMap;
import java.util.Map;

public class ConversorDeNumeroRomano {
	
	private static Map<Character, Integer> tabela = new HashMap<Character, Integer>() {
		{
			put('I', 1);
			put('V', 5);
			put('X', 10);
			put('L', 50);
			put('C', 100);
			put('D', 500);
			put('M', 1000);
		}
	};

	public int converte(String numeroRomano) {
		int acumulador = 0;
		int ultimoVizinhoDaDireita = 0;
		
		for (int i = numeroRomano.length() - 1; i >= 0; i--) {
			int atual = tabela.get(numeroRomano.charAt(i));
			
			int multiplicador = 1;
			if (atual < ultimoVizinhoDaDireita)
				multiplicador = -1;
			
			acumulador += atual * multiplicador;
			ultimoVizinhoDaDireita = atual;
		}
		return acumulador;
	}

}