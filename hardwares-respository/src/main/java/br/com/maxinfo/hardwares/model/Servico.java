package br.com.maxinfo.hardwares.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.maxinfo.hardwares.repository.Persistivel;

/**
 *
 * @author maxpc
 */
@Entity
@Table(name = "servico")
public class Servico extends Persistivel implements Serializable {
  
	private static final long serialVersionUID = 1L;
   
    @Column(name = "codigo")
    private String codigo;
    
    private int status;    
    
    @Column(name = "observacao")
    private String observacao;    
    
   
    private String descricao;
    
    @Column(name = "data_cadastro")
    @Temporal(TemporalType.DATE)
    private Date dataEntrada;
    
    @Column(name = "nome_servico")
    private String nomeServico;
    
    private Boolean pago;
    
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
  
    private BigInteger valor;
    
    @Column(name = "data_entrega_prevista")
    @Temporal(TemporalType.DATE)
    private Date dataEntregaPrevista;

    @Column(name = "data_entrega_confirmada")
    @Temporal(TemporalType.DATE)
    private Date dataEntregaConfirmada;
    
    @JoinColumn(name = "empresa_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Empresa empresa; 
    
    @ManyToMany
    @JoinTable(name="servico_cliente",
	joinColumns={@JoinColumn(name="servico_id")}, inverseJoinColumns={@JoinColumn(name="cliente_id")})
    private List <Cliente> cliente = new LinkedList<Cliente>();

    public Servico() {
    }

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public String getNomeServico() {
		return nomeServico;
	}

	public void setNomeServico(String nomeServico) {
		this.nomeServico = nomeServico;
	}

	public Boolean getPago() {
		return pago;
	}

	public void setPago(Boolean pago) {
		this.pago = pago;
	}

	public BigInteger getValor() {
		return valor;
	}

	public void setValor(BigInteger valor) {
		this.valor = valor;
	}

	public Date getDataEntregaPrevista() {
		return dataEntregaPrevista;
	}

	public void setDataEntregaPrevista(Date dataEntregaPrevista) {
		this.dataEntregaPrevista = dataEntregaPrevista;
	}

	public Date getDataEntregaConfirmada() {
		return dataEntregaConfirmada;
	}

	public void setDataEntregaConfirmada(Date dataEntregaConfirmada) {
		this.dataEntregaConfirmada = dataEntregaConfirmada;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public List<Cliente> getCliente() {
		return cliente;
	}

	public void setCliente(List<Cliente> cliente) {
		this.cliente = cliente;
	}
    
    

    
    
    
    
    
    
    
   
    
    
    
    
    
}
