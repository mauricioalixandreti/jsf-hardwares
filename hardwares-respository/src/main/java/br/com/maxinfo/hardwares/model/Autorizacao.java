package br.com.maxinfo.hardwares.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.maxinfo.hardwares.repository.Persistivel;

@Entity
@Table(name="usuario_autorizacao")
public class Autorizacao extends Persistivel implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="autorizacao")
	private String autorizacao;
	
	@ManyToOne(cascade = CascadeType.ALL ,fetch=FetchType.LAZY)
	@JoinColumn(name="usuario_id")
	private Usuario usuario;

	public String getTipoAutorizacao() {
		return autorizacao;
	}

	public void setTipoAutorizacao(String regraAutorizacao) {
		this.autorizacao = regraAutorizacao;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	
	
}
