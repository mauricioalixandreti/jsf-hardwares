package br.com.maxinfo.hardwares.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.maxinfo.hardwares.repository.Persistivel;

@Entity
@Table(name="historico_transacao_creditos")
public class HistoricoTransacaoCreditos extends Persistivel implements Serializable {
	
	@Column(name="data_transacao")
	private Date dataTransacao;
	
	@Column(name="tipo_historico")
	@Enumerated(EnumType.STRING)
	private TipoHistoricoTransacaoEnum historicoTransacaoEnum;
	
	private Long quantidade;
	
	@ManyToOne
	@JoinColumn(name="empresa_id", referencedColumnName="id")
	private Empresa empresa;

	public Date getDataTransacao() {
		return dataTransacao;
	}

	public void setDataTransacao(Date dataTransacao) {
		this.dataTransacao = dataTransacao;
	}

	public TipoHistoricoTransacaoEnum getHistoricoTransacaoEnum() {
		return historicoTransacaoEnum;
	}

	public void setHistoricoTransacaoEnum(
			TipoHistoricoTransacaoEnum historicoTransacaoEnum) {
		this.historicoTransacaoEnum = historicoTransacaoEnum;
	}

	public Long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
	
	
	
	
}
