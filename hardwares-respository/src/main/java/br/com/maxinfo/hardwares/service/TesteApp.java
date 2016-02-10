package br.com.maxinfo.hardwares.service;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.maxinfo.hardwares.model.Autorizacao;
import br.com.maxinfo.hardwares.model.Cliente;
import br.com.maxinfo.hardwares.model.CreditosSms;
import br.com.maxinfo.hardwares.model.Empresa;
import br.com.maxinfo.hardwares.model.Servico;
import br.com.maxinfo.hardwares.model.Usuario;
import br.com.maxinfo.hardwares.repository.ClienteRepository;
import br.com.maxinfo.hardwares.repository.CreditosSmsRepository;
import br.com.maxinfo.hardwares.repository.EmpresaRepository;
import br.com.maxinfo.hardwares.repository.ServicoRepository;

public class TesteApp {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new 	ClassPathXmlApplicationContext(new String []{"repository-context.xml"});
		UsuarioService userService  = context.getBean(UsuarioService.class);
		EmpresaRepository empresaRepository = context.getBean(EmpresaRepository.class);
		ServicoRepository servicoRepository = context.getBean(ServicoRepository.class);
		ClienteRepository clienteRepository  = context.getBean(ClienteRepository.class);
		CreditosSmsRepository creditosSmsRepository  = context.getBean(CreditosSmsRepository.class);
		
		Empresa empresa = new Empresa();
		empresa.setCnpj("111111111");
		empresa.setEmail("daniel@gmail.com");
		empresa.setNomeEmpresa("Daniel Nutricao");
		empresa.setStatusServico(true);
		
		empresaRepository.saveAndFlush(empresa);
		System.out.println("Empresa Salva");
		
		Usuario usuario = new Usuario();
		
		usuario.setAtivado(true);
		usuario.setUsername("admin");
		usuario.setEmail("admint@maxinfoti.com");
		usuario.setPassword("admin");
		usuario.setDataCadastro(new Date());
		usuario.setUltimoAcesso(new Date());
		
		Autorizacao aut = new Autorizacao();
		
		
		aut.setUsuario(usuario);
		aut.setUsuario(usuario);
		aut.setTipoAutorizacao("ROLE_ADMIN");
//		aut2.setTipoAutorizacao("ROLE_USER_PJ");
		
		List<Autorizacao> autorites  = new LinkedList<Autorizacao>();
		autorites.add(aut);
//		autorites.add(aut2);
		usuario.setAutorizacoes(autorites);	
		
		usuario.setEmpresa(empresa);
		
		System.out.println("SALVANDO USUARIO");
		userService.saveAndUpdate(usuario);
		
		Cliente cliente = new Cliente ();
		cliente.setNomeCompleto("daniel dos santos fragoso");
		cliente.setCelular("2222");
		clienteRepository.saveAndFlush(cliente);
		
		System.out.println("SALVANDO CLIENTE E SERVICO");
		Servico servico = new Servico();
		servico.setNomeServico("teste JPA");
		
		servico.setEmpresa(empresa);
		
		servico.getCliente().add(cliente);
		servicoRepository.saveAndFlush(servico);
		CreditosSms creditos = new CreditosSms();
		creditos.setQuantidade(new Long(300));
		creditos.setEmpresa(empresa);
		creditosSmsRepository.save(creditos);
		
		
		//criar creditos repository para associar a empresa apos ser salvo no banco de dados
		
		
		empresa.setCreditoSms(creditos);
		empresa.getClienteList().add(cliente);
		empresaRepository.saveAndFlush(empresa);		
	}

}
