package br.com.andreguedes.carrinhodecompras;

public class CarrinhoDeComprasBuilder {

	private CarrinhoDeCompras carrinho;
	
	public CarrinhoDeComprasBuilder() {
		carrinho = new CarrinhoDeCompras();
	}
	
	public CarrinhoDeComprasBuilder comItens(Item... itens) {
		for (Item item : itens)
			carrinho.adiciona(item);
		return this;
	}
	
	public CarrinhoDeCompras cria() {
		return carrinho;
	}
	
}