package br.com.andreguedes.calculosalarial;

public enum Cargo {

	DESENVOLVEDOR(3000, new DezOuVintePorCento()), 
	DBA(1500, new QuinzeOuVinteECincoPorCento()), 
	TESTADOR(1500, new QuinzeOuVinteECincoPorCento());
	
	private double salarioBase;
	private RegraDeCalculo regra;
	
	Cargo(double salarioBase, RegraDeCalculo regra) {
		this.salarioBase = salarioBase;
		this.regra = regra;
	}
	
	public double getSalarioBase() {
		return salarioBase;
	}
	
	public RegraDeCalculo getRegra() {
		return regra;
	}
	
}