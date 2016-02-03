package br.com.maxinfo.hardwares.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.maxinfo.hardwares.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	@Query("select " + "	u " + "from Usuario u " + "where " + "u.username = :parametro")
	public List<Usuario> getByUserName(@Param("parametro") String userName);

}
