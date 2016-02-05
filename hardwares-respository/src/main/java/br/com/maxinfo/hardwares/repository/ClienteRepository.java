package br.com.maxinfo.hardwares.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.maxinfo.hardwares.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
