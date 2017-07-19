package br.com.andreguedes.maioremenor;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestaMaiorEMenor {

	@Test
	public void ordemDecrescente() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(new Produto("Geladeira", 650.0));
		carrinho.adiciona(new Produto("Liquidificador", 150.0));
		carrinho.adiciona(new Produto("Ferro de passar", 70.0));
		
		MaiorEMenor maiorEMenor = new MaiorEMenor();
		maiorEMenor.encontra(carrinho);
		
		assertEquals("Ferro de passar", maiorEMenor.getMenor().getNome());
		assertEquals("Geladeira", maiorEMenor.getMaior().getNome());
	}
	
	@Test
	public void ordemCrescente() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(new Produto("Ferro de passar", 70.0));
		carrinho.adiciona(new Produto("Liquidificador", 150.0));
		carrinho.adiciona(new Produto("Geladeira", 650.0));
		
		MaiorEMenor maiorEMenor = new MaiorEMenor();
		maiorEMenor.encontra(carrinho);
		
		assertEquals("Ferro de passar", maiorEMenor.getMenor().getNome());
		assertEquals("Geladeira", maiorEMenor.getMaior().getNome());
	}
	
	@Test
	public void ordemVariada() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(new Produto("Liquidificador", 150.0));
		carrinho.adiciona(new Produto("Ferro de passar", 70.0));
		carrinho.adiciona(new Produto("Geladeira", 650.0));
		
		MaiorEMenor maiorEMenor = new MaiorEMenor();
		maiorEMenor.encontra(carrinho);
		
		assertEquals("Ferro de passar", maiorEMenor.getMenor().getNome());
		assertEquals("Geladeira", maiorEMenor.getMaior().getNome());
	}
	
	@Test
	public void apenasUmProduto() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(new Produto("Geladeira", 650.0));
		
		MaiorEMenor maiorEMenor = new MaiorEMenor();
		maiorEMenor.encontra(carrinho);
		
		assertEquals("Geladeira", maiorEMenor.getMenor().getNome());
		assertEquals("Geladeira", maiorEMenor.getMaior().getNome());
	}
	
}
