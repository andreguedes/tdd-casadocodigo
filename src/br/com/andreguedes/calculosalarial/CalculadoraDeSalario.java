package br.com.andreguedes.calculosalarial;

public class CalculadoraDeSalario {

	/*
	 * Utilização do 'baby steps'
	 */
	public double calcula(Funcionario funcionario) {
		double desconto = 0;
		
		switch (funcionario.getCargo()) {
			case DESENVOLVEDOR:
				desconto = getDesconto(funcionario);
				break;
			case DBA:
			case TESTADOR:
				desconto = getDesconto(funcionario);
				break;
			default:
				break;
		}
		return funcionario.getSalario() * desconto;
	}
	
	private double getDesconto(Funcionario funcionario) {
		return funcionario.getSalario() > funcionario.getCargo().getSalarioBase() ? 
				funcionario.getCargo().getMaiorDesconto() : funcionario.getCargo().getMenorDesconto();
	}

}