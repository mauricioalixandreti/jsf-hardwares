package br.com.maxinfo.hardwares.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.maxinfo.hardwares.model.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

}
