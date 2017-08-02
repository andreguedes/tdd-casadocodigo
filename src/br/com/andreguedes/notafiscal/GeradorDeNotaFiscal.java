package br.com.andreguedes.notafiscal;

import java.util.Calendar;

public class GeradorDeNotaFiscal {
	
	private NFDao nfDao;
	private SAP sap;
	
	public GeradorDeNotaFiscal(NFDao nfDao, SAP sap) {
		this.nfDao = nfDao;
		this.sap = sap;
	}

	public NotaFiscal gera(Pedido pedido) {
		NotaFiscal nf = new NotaFiscal(pedido.getCliente(), pedido.getValorTotal() * 0.94, Calendar.getInstance());
		
		nfDao.persiste(nf);
		sap.envia(nf);
		
		return nf;
	}

}