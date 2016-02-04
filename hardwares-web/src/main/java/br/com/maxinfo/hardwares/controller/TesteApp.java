package br.com.maxinfo.hardwares.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

import br.com.maxinfo.hardwares.model.Usuario;
import br.com.maxinfo.hardwares.sercurity.SecurityUser;
import br.com.maxinfo.hardwares.service.UsuarioService;

public class TesteApp {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new 	ClassPathXmlApplicationContext(new String []{"repository-context.xml","security-context.xml"});
		UsuarioService userService  = context.getBean(UsuarioService.class);
		
//		Usuario a = new Usuario();
//		
//		a.setAtivado(true);
//		a.setUsername("root");
//		a.setEmail("maxinfoti@gmail.com");
//		a.setPassword("root");
//		a.setDataCadastro(new Date());
//		a.setUltimoAcesso(new Date());
//		
//		Autorizacao aut = new Autorizacao();
//		Autorizacao aut2 = new Autorizacao();
//		
//		aut.setUsuario(a);
//		aut.setUsuario(a);
//		aut.setTipoAutorizacao("ROLE_USER");
//		
		
//		aut2.setTipoAutorizacao("ROLE_USER_PJ");
		
//		List<Autorizacao> autorites  = new LinkedList<Autorizacao>();
//		autorites.add(aut);
////		autorites.add(aut2);
//		a.setAutorizacoes(autorites);
//		
//				
//		System.out.println("SALVANDO USUARIO");
//		userService.saveAndUpdate(a);
		
//		 SecurityUser logado;
//		 Usuario u ;
//			
//			SecurityContext segContext = SecurityContextHolder.getContext();
//			                
//		        if (segContext instanceof SecurityContext){
//		            Authentication authentication = segContext.getAuthentication();
//		            if (authentication instanceof Authentication){
//		            	logado = ((SecurityUser)authentication.getPrincipal());
//		            }
//		        }		
		
		
	}

}
