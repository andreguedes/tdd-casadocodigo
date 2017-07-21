package br.com.andreguedes.calculosalarial;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculadoraDeSalario {

	@Test
	public void testDeveCalcularSalarioDesenvolvedorAbaixoDoLimite() {
		CalculadoraDeSalario calculadoraDeSalario = new CalculadoraDeSalario();
		Funcionario funcionario = new Funcionario("Dev", 1500, Cargo.DESENVOLVEDOR);
		
		double salario = calculadoraDeSalario.calcula(funcionario);
		
		assertEquals(funcionario.getSalario() * funcionario.getCargo().getMenorDesconto(), salario, 0.00001);
	}
	
	@Test
	public void testDeveCalcularSalarioDesenvolvedorAcimaDoLimite() {
		CalculadoraDeSalario calculadoraDeSalario = new CalculadoraDeSalario();
		Funcionario funcionario = new Funcionario("Dev", 4000, Cargo.DESENVOLVEDOR);
		
		double salario = calculadoraDeSalario.calcula(funcionario);
		
		assertEquals(funcionario.getSalario() * funcionario.getCargo().getMaiorDesconto(), salario, 0.00001);
	}
	
	@Test
	public void testDeveCalcularSalarioDBAAbaixoDoLimite() {
		CalculadoraDeSalario calculadoraDeSalario = new CalculadoraDeSalario();
		Funcionario funcionario = new Funcionario("DBA", 500, Cargo.DBA);
		
		double salario = calculadoraDeSalario.calcula(funcionario);
		
		assertEquals(funcionario.getSalario() * funcionario.getCargo().getMenorDesconto(), salario, 0.00001);
	}
	
	@Test
	public void testDeveCalcularSalarioTestadorAcimaDoLimite() {
		CalculadoraDeSalario calculadoraDeSalario = new CalculadoraDeSalario();
		Funcionario funcionario = new Funcionario("DBA", 1500, Cargo.TESTADOR);
		
		double salario = calculadoraDeSalario.calcula(funcionario);
		
		assertEquals(funcionario.getSalario() * funcionario.getCargo().getMenorDesconto(), salario, 0.00001);
	}
	
}