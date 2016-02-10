package br.com.maxinfo.hardwares.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.springframework.context.annotation.Scope;

import br.com.maxinfo.hardwares.model.Cliente;

@ViewScoped
@ManagedBean
public class ClienteController {

	public Cliente  current ;

	public Cliente getCurrent() {
		if (current==null){
			return  current = new Cliente ();
		}else{
			return current;			
		}
	}

	public void setCurrent(Cliente current) {
		this.current = current;
	}
	
	
	
	
}
