package br.com.andreguedes.notafiscal;

import org.junit.Test;
import org.mockito.Mockito;

public class NFDaoTest {

	@Test
	public void testDevePersistirNFGerada() {
		NFDao dao = Mockito.mock(NFDao.class);
		
		GeradorDeNotaFiscal gerador = new GeradorDeNotaFiscal(dao, new SAP());
		Pedido pedido = new Pedido("André", 1000, 1);
		
		NotaFiscal nf = gerador.gera(pedido);
		
		Mockito.verify(dao).persiste(nf);
	}
	
}