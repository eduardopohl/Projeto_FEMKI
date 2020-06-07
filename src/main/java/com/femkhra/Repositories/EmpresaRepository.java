package com.femkhra.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.femkhra.Models.Cadastro;

public interface EmpresaRepository extends CrudRepository<Cadastro, String>{
	Cadastro findByCodigo(long codigo);

}
