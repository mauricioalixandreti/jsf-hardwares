package br.com.maxinfo.hardwares.service;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.maxinfo.hardwares.model.Autorizacao;
import br.com.maxinfo.hardwares.model.Usuario;

public class TesteApp {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new 	ClassPathXmlApplicationContext(new String []{"repository-context.xml"});
		UsuarioService userService  = context.getBean(UsuarioService.class);
		
		Usuario a = new Usuario();
		
		a.setAtivado(true);
		a.setUsername("root");
		a.setEmail("maxinfoti@gmail.com");
		a.setSenha("root");
		a.setDataCadastro(new Date());
		a.setUltimoAcesso(new Date());
		
		Autorizacao aut = new Autorizacao();
		Autorizacao aut2 = new Autorizacao();
		
		aut.setUsuario(a);
		aut.setUsuario(a);
		aut.setTipoAutorizacao("ROLE_USER");
//		aut2.setTipoAutorizacao("ROLE_USER_PJ");
		
		List<Autorizacao> autorites  = new LinkedList<Autorizacao>();
		autorites.add(aut);
//		autorites.add(aut2);
		a.setAutorizacoes(autorites);
		
				
		System.out.println("SALVANDO USUARIO");
		userService.saveAndUpdate(a);
		
	}

}
