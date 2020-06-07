package com.femkhra.Repositories;

import java.util.List;

import com.femkhra.Models.Cadastro;
import com.femkhra.Models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository  extends JpaRepository<Cadastro, String>{

	List<Cadastro> findByUsuario(Usuario usuario); 
	
}
