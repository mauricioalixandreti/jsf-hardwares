package br.com.maxinfo.hardwares.model;

public enum TipoHistoricoTransacaoEnum {
	CRED("CREDITO"), DEB("DEBITO"), EST("ESTORNO");
	
	private String newTipoHistoricoTransacao;
	
	private TipoHistoricoTransacaoEnum (String newTipo){
		this.newTipoHistoricoTransacao = newTipo;
	}

	public String getNewTipoHistoricoTransacao() {
		return newTipoHistoricoTransacao;
	}

	public void setNewTipoHistoricoTransacao(String newTipoHistoricoTransacao) {
		this.newTipoHistoricoTransacao = newTipoHistoricoTransacao;
	}
	
	
	
	
	
	
}
