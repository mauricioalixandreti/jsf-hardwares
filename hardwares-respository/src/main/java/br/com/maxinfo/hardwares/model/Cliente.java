
package br.com.maxinfo.hardwares.model;
import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.maxinfo.hardwares.repository.Persistivel;

/**
 *
 * @author maxpc
 */
@Entity
@Table(name = "cliente")
public class Cliente extends Persistivel implements Serializable {
    private static final long serialVersionUID = 1L;   
  
    private String email;    
   
    @Column(name = "nome")
    private String nomeCompleto;
    
    private String celular;
    
    private String rua;
    
    private String bairro;    
    
    private String cidade;
    
    @Column(name = "numero_rua")
    private Integer numeroRua;
    
    @Column(name = "data_aniversario")
    @Temporal(TemporalType.DATE)
    private Date dataAniversario;    
    
    @Column(name = "data_cadastro")
    @Temporal(TemporalType.DATE)
    private Date dataCadastro;

    public Cliente() {
    }

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Integer getNumeroRua() {
		return numeroRua;
	}

	public void setNumeroRua(Integer numeroRua) {
		this.numeroRua = numeroRua;
	}

	public Date getDataAniversario() {
		return dataAniversario;
	}

	public void setDataAniversario(Date dataAniversario) {
		this.dataAniversario = dataAniversario;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}   
   
}
