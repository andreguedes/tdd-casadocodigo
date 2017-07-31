package br.com.andreguedes.calculosalarial;

public abstract class RegraDeCalculo {

	public double calcula(Funcionario funcionario) {
		if (funcionario.getSalario() > limite())
			return funcionario.getSalario() * porcentagemAcimaDoLimite();
		return funcionario.getSalario() * porcentagemBase();
	}
	
	protected abstract double limite();
	protected abstract double porcentagemAcimaDoLimite();
	protected abstract double porcentagemBase();
	
}