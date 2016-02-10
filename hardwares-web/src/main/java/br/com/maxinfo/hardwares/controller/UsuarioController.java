package br.com.maxinfo.hardwares.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.context.annotation.Scope;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import br.com.maxinfo.hardwares.model.Usuario;
import br.com.maxinfo.hardwares.sercurity.SecurityUser;


@Component()
@Scope("session")
@PreAuthorize("isFullyAuthenticated()")
public class UsuarioController {
	
	private SecurityUser usuario;

	public UsuarioController (){		
		SecurityContext context = SecurityContextHolder.getContext();
	        if (context instanceof SecurityContext){
	            Authentication authentication = context.getAuthentication();
	            if (authentication instanceof Authentication){
	                usuario = ((SecurityUser)authentication.getPrincipal());
	            }
	        }		
	}
	
	public Usuario getUsuario (){
		return usuario.getUser();
	}
	
}
