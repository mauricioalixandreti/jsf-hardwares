package br.com.maxinfo.hardwares.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.maxinfo.hardwares.model.Servico;

public interface ServicoRepository extends JpaRepository<Servico, Long> {

}
