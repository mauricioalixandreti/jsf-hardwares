package br.com.maxinfo.hardwares.model;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.maxinfo.hardwares.repository.Persistivel;

@Entity
@Table(name="usuario")
public class Usuario extends Persistivel implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String username;
	
	private String email;

	private String password;
	
	private String nome;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER,mappedBy="usuario")
	private  List<Autorizacao> autorizacoes = new LinkedList<Autorizacao>();
	
	@Column(name = "data_cadastro")
	private Date dataCadastro;

	@Column(name = "ultimo_acesso")
	private Date ultimoAcesso;

	private Boolean ativado;
	
	@JoinColumn(name = "empresa_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
	private Empresa empresa;
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Date getUltimoAcesso() {
		return ultimoAcesso;
	}

	public void setUltimoAcesso(Date ultimoAcesso) {
		this.ultimoAcesso = ultimoAcesso;
	}

	public Boolean getAtivado() {
		return ativado;
	}

	public void setAtivado(Boolean ativado) {
		this.ativado = ativado;
	}

	public List<Autorizacao> getAutorizacoes() {
		return autorizacoes;
	}

	public void setAutorizacoes(List<Autorizacao> autorizacoes) {
		this.autorizacoes = autorizacoes;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public String getNome() {
		return nome;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nome = nomeUsuario;
	}

	
    
	
	
	

}
