package br.com.andreguedes.calculosalarial;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculadoraDeSalario {

	@Test
	public void testDeveCalcularSalarioDesenvolvedor() {
		CalculadoraDeSalario calculadoraDeSalario = new CalculadoraDeSalario();
		Funcionario funcionario = new Funcionario("Dev", 1500, Cargo.DESENVOLVEDOR);
		
		double salario = calculadoraDeSalario.calcula(funcionario);
		
		assertEquals(1350, salario, 0.00001);
	}
		
}