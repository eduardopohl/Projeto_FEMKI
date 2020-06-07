package com.femkhra.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.femkhra.Models.Cadastro;
import com.femkhra.Models.Equipamento;
import com.femkhra.Models.Usuario;
import com.femkhra.Repositories.CompanyRepository;
import com.femkhra.Repositories.EquipamentoRepository;

@Service
public class TaskService {
	
	@Autowired
	private CompanyRepository companyRepository;
	
	
	@Autowired
	private EquipamentoRepository equipamentoRepository;
	
	public void addCompany(Cadastro cadastro, Usuario usuario) {
		cadastro.setUsuario(usuario);
		companyRepository.save(cadastro);
	}
	
	public List<Cadastro>  findUsuarioTask(Usuario usuario){
		
		return companyRepository.findByUsuario(usuario);
	}
	

	
	public void updateCompany(Cadastro cadastro) {
		
		companyRepository.save(cadastro);
	}


}
