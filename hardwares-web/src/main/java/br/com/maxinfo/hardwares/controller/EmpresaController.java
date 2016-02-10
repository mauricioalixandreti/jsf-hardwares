package br.com.maxinfo.hardwares.controller;

import java.io.Serializable;
import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import br.com.maxinfo.hardwares.model.Autorizacao;
import br.com.maxinfo.hardwares.model.Empresa;
import br.com.maxinfo.hardwares.model.Usuario;
import br.com.maxinfo.hardwares.service.EmpresaService;
import br.com.maxinfo.hardwares.service.UsuarioService;

@Component()
@Scope("session")
public class EmpresaController implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Autowired
	private EmpresaService service;
	@Autowired
	private UsuarioService usuarioService;
	public Empresa empresa;
	private Usuario usuario;
	
	public String cadastrarEmpresa (){
//		 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Warning!", "Watch out for PrimeFaces."));
//		if(empresa.getNomeEmpresa()!=null || !empresa.getNomeEmpresa().trim().isEmpty()){    
			   
			try{				
				service.cadastrarEmpresa(getEmpresa());		
				usuario = new Usuario();		
				usuario.setNomeUsuario(getEmpresa().getResponsavel());
				usuario.setPassword(getEmpresa().getSenha());
				usuario.setAtivado(true);
				usuario.setDataCadastro(new Date ());
				usuario.setEmail(getEmpresa().getEmail());
				usuario.setEmpresa(getEmpresa());
				usuario.setNomeUsuario(getEmpresa().getUsuario());
				Autorizacao autorizacao = new Autorizacao ();
				autorizacao.setTipoAutorizacao("ROLE_ADMIN");
				autorizacao.setUsuario(usuario);
				usuario.getAutorizacoes().add(autorizacao);
				usuarioService.saveAndUpdate(usuario);
		        setEmpresa(null);
			}catch (Exception ex){
				return "cadastro.jsf?error=true";
			}
		
		return "cadastro.xhtml?error=true";
		
	}
	
	public void cadastarUsuario (){
		
	}
	
	
	public Empresa getEmpresa() {
		if(empresa == null){
			return empresa = new Empresa ();
		}else{
			return empresa;			
		}
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
	
	
	
	
	
}
