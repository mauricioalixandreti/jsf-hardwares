package br.com.maxinfo.hardwares.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.maxinfo.hardwares.repository.Persistivel;

@Entity
@Table(name="creditos_sms")
public class CreditosSms extends Persistivel implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Long quantidade;

	public Long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}
	
	@OneToOne
	private Empresa empresa;

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}	
	
	
	
}
