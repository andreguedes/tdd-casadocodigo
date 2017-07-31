package br.com.andreguedes.calculosalarial;

public class DezOuVintePorCento implements RegraDeCalculo {

	@Override
	public double calcula(Funcionario funcionario) {
		if (funcionario.getSalario() > 3000) {
			return funcionario.getSalario() * 0.8;
		}
		return funcionario.getSalario() * 0.9;
	}

}