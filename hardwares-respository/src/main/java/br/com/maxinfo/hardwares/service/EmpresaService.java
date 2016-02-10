package br.com.maxinfo.hardwares.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.maxinfo.hardwares.model.Empresa;
import br.com.maxinfo.hardwares.repository.EmpresaRepository;


@Service
public class EmpresaService {
	
	@Autowired
	private EmpresaRepository resopsitory;
	
	public void cadastrarEmpresa (Empresa  cadastro){
		resopsitory.saveAndFlush(cadastro);
	}
	
}
