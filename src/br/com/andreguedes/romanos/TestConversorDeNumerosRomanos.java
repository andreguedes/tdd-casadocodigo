package br.com.andreguedes.romanos;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestConversorDeNumerosRomanos {

	@Test
	public void testDeveEntenderOSimboloI() {
		ConversorDeNumeroRomano conversor = new ConversorDeNumeroRomano();
		int valor = conversor.converte("I");
		assertEquals(1, valor);
	}
	
	@Test
	public void testDeveEntenderOSimboloV() {
		ConversorDeNumeroRomano conversor = new ConversorDeNumeroRomano();
		int valor = conversor.converte("V");
		assertEquals(5, valor);
	}
	
	@Test
	public void testEntenderDoisSimbolosComoII() {
		ConversorDeNumeroRomano conversor = new ConversorDeNumeroRomano();
		int valor = conversor.converte("II");
		assertEquals(2, valor);
	}
	
	@Test
	public void testEntenderTresSimbolosComoIII() {
		ConversorDeNumeroRomano conversor = new ConversorDeNumeroRomano();
		int valor = conversor.converte("III");
		assertEquals(3, valor);
	}
	
	@Test
	public void testDeveEntenderQuatroSimbolosDoisADoisComoXXII() {
		ConversorDeNumeroRomano conversor = new ConversorDeNumeroRomano();
		int valor = conversor.converte("XXII");
		assertEquals(22, valor);
	}
	
	@Test
	public void testEntenderNumerosComoIX() {
		ConversorDeNumeroRomano conversor = new ConversorDeNumeroRomano();
		int valor = conversor.converte("IX");
		assertEquals(9, valor);
	}
	
	@Test
	public void testDeveEntenderNumerosComplexosComoXXIV() {
		ConversorDeNumeroRomano conversor = new ConversorDeNumeroRomano();
		int valor = conversor.converte("XXIV");
		assertEquals(24, valor);
	}
	
}