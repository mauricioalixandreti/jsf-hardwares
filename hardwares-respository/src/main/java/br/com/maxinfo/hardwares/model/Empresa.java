
package br.com.maxinfo.hardwares.model;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.maxinfo.hardwares.repository.Persistivel;

/**
 *
 * @author maxpc
 */
@Entity
@Table(name = "empresa")
public class Empresa extends Persistivel implements Serializable {
   
	private static final long serialVersionUID = 1L;    
	
	@Column(unique=true)
    private String cnpj;
    
    private String email;
    
    @Column(name = "nome_empresa")
    private String nomeEmpresa; 
    
    @Column(name = "responsavel")
    private String responsavel;           
    
    private String celular;
    
    private String usuario;   
    
    private String senha;
   
    @Column(name = "status_servico")
    private boolean statusServico = true;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy="empresa")    
    private List<Servico> servicoList = new LinkedList<Servico>();
    
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empresa")
//    private List<Cliente> clienteList;
//    
    @OneToMany(cascade = CascadeType.ALL,  mappedBy="empresa")
    private List<Usuario> usuarioList = new LinkedList<Usuario>();  
   
    @ManyToMany
    @JoinTable(name="empresa_cliente",
	joinColumns={@JoinColumn(name="empresa_id")}, inverseJoinColumns={@JoinColumn(name="cliente_id")})
    private List <Cliente> clienteList = new LinkedList<Cliente>();
  
    @OneToMany(cascade = CascadeType.ALL,  mappedBy="empresa")
    private List<HistoricoTransacaoCreditos> historicoTransacaoCreditos = new LinkedList<HistoricoTransacaoCreditos>();
    
   @OneToOne (mappedBy="empresa")
   private CreditosSms creditoSms;

    public Empresa() {
    }


	public String getCnpj() {
		return cnpj;
	}



	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getNomeEmpresa() {
		return nomeEmpresa;
	}



	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}



	public String getSenha() {
		return senha;
	}



	public void setSenha(String senha) {
		this.senha = senha;
	}



	public boolean getStatusServico() {
		return statusServico;
	}



	public void setStatusServico(boolean statusServico) {
		this.statusServico = statusServico;
	}



	public List<Servico> getServicoList() {
		return servicoList;
	}



	public void setServicoList(List<Servico> servicoList) {
		this.servicoList = servicoList;
	}



	public List<Usuario> getUsuarioList() {
		return usuarioList;
	}



	public void setUsuarioList(List<Usuario> usuarioList) {
		this.usuarioList = usuarioList;
	}



	public List<HistoricoTransacaoCreditos> getHistoricoTransacaoCreditos() {
		return historicoTransacaoCreditos;
	}



	public void setHistoricoTransacaoCreditos(
			List<HistoricoTransacaoCreditos> historicoTransacaoCreditos) {
		this.historicoTransacaoCreditos = historicoTransacaoCreditos;
	}



	public CreditosSms getCreditoSms() {
		return creditoSms;
	}



	public void setCreditoSms(CreditosSms creditoSms) {
		this.creditoSms = creditoSms;
	}



	public List<Cliente> getClienteList() {
		return clienteList;
	}



	public void setClienteList(List<Cliente> clienteList) {
		this.clienteList = clienteList;
	}


	public String getResponsavel() {
		return responsavel;
	}


	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}


	public String getCelular() {
		return celular;
	}


	public void setCelular(String celular) {
		this.celular = celular;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

   

    
    
    
    
}
