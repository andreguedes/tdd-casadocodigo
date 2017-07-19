package br.com.andreguedes.maioremenor;

public class ValidaMaiorEMenor {

	public static void main(String[] args) {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(new Produto("Geladeira", 650.0));
		carrinho.adiciona(new Produto("Liquidificador", 150.0));
		carrinho.adiciona(new Produto("Ferro de passar", 70.0));
		
		MaiorEMenor maiorEMenor = new MaiorEMenor();
		maiorEMenor.encontra(carrinho);
		
		System.out.println("O maior produto é " + maiorEMenor.getMaior().getNome());
		System.out.println("O menor produto é " + maiorEMenor.getMenor().getNome());
	}

}