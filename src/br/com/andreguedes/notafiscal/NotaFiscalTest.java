package br.com.andreguedes.notafiscal;

import static org.junit.Assert.*;

import org.junit.Test;

public class NotaFiscalTest {

	@Test
	public void testDeveGerarNFComValorDeImpostosDescontado() {
		GeradorDeNotaFiscal gerador = new GeradorDeNotaFiscal(new NFDao(), new SAP());
		Pedido pedido = new Pedido("André", 1000, 1);
		
		NotaFiscal nf = gerador.gera(pedido);
		
		assertEquals(1000 * 0.94, nf.getValor(), 0.0001);
	}
	
}