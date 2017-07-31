package br.com.andreguedes.calculosalarial;

public class QuinzeOuVinteECincoPorCento extends RegraDeCalculo {

	@Override
	protected double limite() {
		return 2500;
	}

	@Override
	protected double porcentagemAcimaDoLimite() {
		return 0.85;
	}

	@Override
	protected double porcentagemBase() {
		return 0.75;
	}

}