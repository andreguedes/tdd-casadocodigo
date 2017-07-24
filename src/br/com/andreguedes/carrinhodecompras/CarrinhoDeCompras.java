package br.com.andreguedes.carrinhodecompras;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarrinhoDeCompras {

	private List<Item> itens;
	
	public CarrinhoDeCompras() {
		this.itens = new ArrayList<>();
	}
	
	public void adiciona(Item item) {
		this.itens.add(item);
	}
	
	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}
	
	public double maiorValor() {
		if (itens.size() == 0)
			return 0;
		
		double maior = itens.get(0).getValorTotal();
		for (Item item : itens) {
			if (item.getValorTotal() > maior)
				maior = item.getValorTotal();
		}
		return maior;
	}
	
}