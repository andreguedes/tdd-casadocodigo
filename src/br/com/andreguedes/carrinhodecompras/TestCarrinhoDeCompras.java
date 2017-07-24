package br.com.andreguedes.carrinhodecompras;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCarrinhoDeCompras {
	
	private CarrinhoDeCompras carrinho;
	
	@Before
	public void inicializa() {
		carrinho = new CarrinhoDeCompras();
	}

	@Test
	public void testDeveRetornarZeroSeCarrinhoForVazio() {
		assertEquals(0.0, carrinho.maiorValor(), 0.00001);
	}
	
	@Test
	public void testDeveRetornarValorDoItemSeCarrinhoTiver1Elemento() {
		carrinho = new CarrinhoDeComprasBuilder().comItens(
				new Item("Geladeira", 1, 900.0)).cria();
		
		assertEquals(900.0, carrinho.maiorValor(), 0.00001);
	}
	
	@Test
	public void testDeveRetornarMaiorValorSeCarrinhoTiverMuitosItens() {
		carrinho = new CarrinhoDeComprasBuilder().comItens(
				new Item("Geladeira", 1, 900.0),
				new Item("Maquina de lavar", 1, 1200.0),
				new Item("Fogão", 1, 400.0)).cria();
		
		assertEquals(1200.0, carrinho.maiorValor(), 0.00001);
	}
	
}