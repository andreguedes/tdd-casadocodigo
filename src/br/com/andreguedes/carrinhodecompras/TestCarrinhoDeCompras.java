package br.com.andreguedes.carrinhodecompras;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCarrinhoDeCompras {

	@Test
	public void testDeveRetornarZeroSeCarrinhoForVazio() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		assertEquals(0.0, carrinho.maiorValor(), 0.00001);
	}
	
	@Test
	public void testDeveRetornarValorDoItemSeCarrinhoTiver1Elemento() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(new Item("Geladeira", 1, 900.0));
		
		assertEquals(900.0, carrinho.maiorValor(), 0.00001);
	}
	
	@Test
	public void testDeveRetornarMaiorValorSeCarrinhoTiverMuitosItens() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(new Item("Geladeira", 1, 900.0));
		carrinho.adiciona(new Item("Maquina de lavar", 1, 1200.0));
		carrinho.adiciona(new Item("Fogão", 1, 400.0));
		
		assertEquals(1200.0, carrinho.maiorValor(), 0.00001);
	}
	
}