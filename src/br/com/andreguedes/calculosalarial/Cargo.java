package br.com.andreguedes.calculosalarial;

public enum Cargo {

	DESENVOLVEDOR(3000, 0.8, 0.9), 
	DBA(1500, 0.75, 0.85), 
	TESTADOR(1500, 0.75, 0.85);
	
	private double salarioBase, maiorDesconto, menorDesconto;
	
	Cargo(double salarioBase, double maiorDesconto, double menorDesconto) {
		this.salarioBase = salarioBase;
		this.maiorDesconto = maiorDesconto;
		this.menorDesconto = menorDesconto;
	}
	
	public double getSalarioBase() {
		return salarioBase;
	}

	public double getMaiorDesconto() {
		return maiorDesconto;
	}

	public double getMenorDesconto() {
		return menorDesconto;
	}
	
}