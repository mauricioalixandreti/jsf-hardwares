package br.com.maxinfo.hardwares.sercurityservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import br.com.maxinfo.hardwares.model.Autorizacao;
import br.com.maxinfo.hardwares.model.Usuario;
import br.com.maxinfo.hardwares.sercurity.SecurityUser;
import br.com.maxinfo.hardwares.service.UsuarioService;

public class UsuarioSecurityService implements UserDetailsService {
	
	@Autowired
	private UsuarioService usuarioService;
	
	
	@Transactional
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		Usuario usuario  = usuarioService.getByUserName(username);
		SecurityUser userDetails = null;
		
		if (usuario != null) {
			List<Autorizacao> autorizacoes = usuario.getAutorizacoes();
			List<SimpleGrantedAuthority> authorities = new ArrayList<SimpleGrantedAuthority>(autorizacoes.size());
			for (Autorizacao direito : autorizacoes) {
				authorities.add(new SimpleGrantedAuthority(direito.getTipoAutorizacao().toUpperCase()));
			}
			userDetails = new SecurityUser(usuario, authorities);
		}

		return userDetails;
		

	}

}
