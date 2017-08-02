package br.com.andreguedes.notafiscal;

import org.junit.Test;
import org.mockito.Mockito;

public class SAPTest {

	@Test
	public void testDeveEnviarNFGeradaParaSAP() {
		NFDao dao = Mockito.mock(NFDao.class);
		SAP sap = Mockito.mock(SAP.class);
		
		GeradorDeNotaFiscal gerador = new GeradorDeNotaFiscal(dao, sap);
		Pedido pedido = new Pedido("André", 1000, 1);
		
		NotaFiscal nf = gerador.gera(pedido);
		
		Mockito.verify(sap).envia(nf);
	}
	
}