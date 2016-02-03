package br.com.maxinfo.hardwares.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.maxinfo.hardwares.model.Usuario;
import br.com.maxinfo.hardwares.repository.UsuarioRepository;


@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repository;

	public Usuario saveAndUpdate(Usuario user) {
		return repository.saveAndFlush(user);
	}

	public List<Usuario> listAll() {
		return repository.findAll();
	}

	public Usuario getByUserName(String username) {
		Usuario u = null;
		List<Usuario> list = repository.getByUserName(username);
		if (list != null && !list.isEmpty()) {
			u = list.get(0);
		}
		return u;
	}
	
	
}
