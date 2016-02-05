
package br.com.maxinfo.hardwares.model;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="E-mail inválido")//if the field contains email address consider using this annotation to enforce field validation
  
    private String cnpj;
    
    private String email;
    
    @Column(name = "nome_empresa")
    private String nomeEmpresa; 
   
    private String senha;
   
    @Column(name = "status_servico")
    private boolean statusServico;
    
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
    private List <Cliente> cliente = new LinkedList<Cliente>();
  

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

   

    
    
    
    
}
