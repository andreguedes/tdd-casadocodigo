package br.com.andreguedes.calculosalarial;

public class CalculadoraDeSalario {
	
	public double calcula(Funcionario funcionario) {	
		return funcionario.getCargo().getRegra().calcula(funcionario);
	}

}