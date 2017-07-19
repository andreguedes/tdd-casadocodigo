package br.com.andreguedes.maioremenor;
import java.util.ArrayList;
import java.util.List;


public class CarrinhoDeCompras {

	private List<Produto> produtos;
	
	public void adiciona(Produto produto) {
		if (produtos == null)
			produtos = new ArrayList<>();
		produtos.add(produto);
	}

	public List<Produto> getProdutos() {
		return produtos;
	}
	
}